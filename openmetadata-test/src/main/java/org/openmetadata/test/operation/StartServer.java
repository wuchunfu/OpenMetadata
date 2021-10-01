package org.openmetadata.test.operation;

import org.openmetadata.test.properties.Property;

import java.io.IOException;
import java.util.logging.Logger;


public class StartServer {
    public static final String PATH = Property.getInstance().getPath();
    private static final Logger LOG = Logger.getLogger(StartServer.class.getName());

    public static void gitClone() throws IOException, InterruptedException {
        String[] gitClone = {"bash", "-c", "cd " + '"' + PATH + '"' + "&& git clone git@github.com:open-metadata/OpenMetadata.git"};
        Process processGitClone = Runtime.getRuntime().exec(gitClone);
        processGitClone.waitFor();
        LOG.info("Git Clone Done");
    }

    public static void mvnPackage() throws IOException, InterruptedException {
        String[] mvnPackage = {"bash", "-c", "cd " + '"' + PATH + '"' + "/OpenMetadata " + "&& mvn -DskipTests clean package"};
        Process processMvnPackage = Runtime.getRuntime().exec(mvnPackage);
        processMvnPackage.waitFor();
        LOG.info("Maven Package Done");
    }

    public static void unTar() throws IOException, InterruptedException {
        String[] unTar = {"bash", "-c", "cd " + '"' + PATH + '"' + "/OpenMetadata/dist/target "  + "&& tar -zxvf openmetadata-0.5.0-SNAPSHOT.tar.gz"};
        Process processUnTar = Runtime.getRuntime().exec(unTar);
        processUnTar.waitFor();
        LOG.info("UnTar Done");
    }

    public static void migrate() throws IOException, InterruptedException {
        String[] migrate = {"bash", "-c", "cd " + '"' + PATH + '"' + "/OpenMetadata/dist/target/openmetadata-0.5.0-SNAPSHOT "  + "&& ./bootstrap/bootstrap_storage.sh drop-create"};
        Process processMigrate = Runtime.getRuntime().exec(migrate);
        processMigrate.waitFor();
        LOG.info("Migrate Done");
    }

    public static void startServer() throws IOException, InterruptedException {
        String[] startServer = {"bash", "-c", "cd " + '"' + PATH + '"' + "/OpenMetadata/dist/target/openmetadata-0.5.0-SNAPSHOT "  + "&& ./bin/openmetadata.sh start"};
        Process processStartServer = Runtime.getRuntime().exec(startServer);
        processStartServer.waitFor();
        LOG.info("Start Server Done");
    }
}
