package org.openmetadata.test.operation;

import org.openmetadata.test.properties.Property;

import java.io.IOException;
import java.util.logging.Logger;

public class IngestSampleData {
    public static final String PATH = Property.getInstance().getPath();
    private static final Logger LOG = Logger.getLogger(StartServer.class.getName());
    private static final String[] envDeactivate = {"bash", "-c", "cd " + '"' + PATH + '"' + "/OpenMetadata/ingestion "  + "&& deactivate"};
    private static final String[] removeEnv = {"bash", "-c", "cd " + '"' + PATH + '"' + "/OpenMetadata/ingestion "  + "&& rm -rf env/"};
    private static final String[] venvInstall = {"bash", "-c", "cd " + '"' + PATH + '"' + "/OpenMetadata/ingestion "  + "&& python3 -m venv env"};
    private static final String[] envActivate = {"bash", "-c", "cd " + '"' + PATH + '"' + "/OpenMetadata/ingestion "  + "&& source env/bin/activate"};

    public static void enableEnv() throws IOException, InterruptedException {
        Process processEnvDeactivate = Runtime.getRuntime().exec(envDeactivate);
        processEnvDeactivate.waitFor();
        Process processRemoveEnv = Runtime.getRuntime().exec(removeEnv);
        processRemoveEnv.waitFor();
        Process processVenvInstall = Runtime.getRuntime().exec(venvInstall);
        processVenvInstall.waitFor();
        LOG.info("Env Enable Done");
    }

    public static void preInstall() throws IOException, InterruptedException {
        Runtime.getRuntime().exec(envActivate);
        String[] preInstall = {"bash", "-c", "cd " + '"' + PATH + '"' + "/OpenMetadata/ingestion "  + "&& python3 -m pip install 'openmetadata-ingestion[sample-data, elasticsearch]'"};
        Process processIngestion = Runtime.getRuntime().exec(preInstall);
        processIngestion.waitFor();
        LOG.info("Required Installation Done");
    }

    public static void sample_users() throws IOException, InterruptedException {
        Runtime.getRuntime().exec(envActivate);
        String[] sample_users = {"bash", "-c", "cd " + '"' + PATH + '"' + "/OpenMetadata/ingestion "  + "&& metadata ingest -c ./pipelines/sample_users.json"};
        Process processSampleUser = Runtime.getRuntime().exec(sample_users);
        processSampleUser.waitFor();
        LOG.info("Sample Users Done");
    }

    public static void sample_data() throws IOException, InterruptedException {
        Runtime.getRuntime().exec(envActivate);
        String[] sample_data = {"bash", "-c", "cd " + '"' + PATH + '"' + "/OpenMetadata/ingestion "  + "&& metadata ingest -c ./pipelines/sample_data.json"};
        Process processSampleData = Runtime.getRuntime().exec(sample_data);
        processSampleData.waitFor();
        LOG.info("Sample Data Done");
    }

    public static void sample_usage() throws IOException, InterruptedException {
        Runtime.getRuntime().exec(envActivate);
        String[] sample_usage = {"bash", "-c", "cd " + '"' + PATH + '"' + "/OpenMetadata/ingestion "  + "&& metadata ingest -c ./pipelines/sample_usage.json"};
        Process processSampleUsage = Runtime.getRuntime().exec(sample_usage);
        processSampleUsage.waitFor();
        LOG.info("Sample Usage Done");
    }

    public static void esDocker() throws IOException, InterruptedException {
        Runtime.getRuntime().exec(envActivate);
        String[] esDocker = {"bash", "-c", "cd " + '"' + PATH + '"' + "/OpenMetadata/ingestion "  + "&& docker run -p 9200:9200 -p 9300:9300 -e \"discovery.type=single-node\" docker.elastic.co/elasticsearch/elasticsearch:7.10.2"};
        Process processEsDocker = Runtime.getRuntime().exec(esDocker);
        Thread.sleep(90000);
        LOG.info("EsDocker Done");
    }

    public static void elasticSearch() throws IOException, InterruptedException {
        Runtime.getRuntime().exec(envActivate);
        String[] elasticSearch = {"bash", "-c", "cd " + '"' + PATH + '"' + "/OpenMetadata/ingestion "  + "&& metadata ingest -c ./pipelines/metadata_to_es.json"};
        Process processElasticSearch = Runtime.getRuntime().exec(elasticSearch);
        processElasticSearch.waitFor();
        LOG.info("Elastic Search Done");
    }
}
