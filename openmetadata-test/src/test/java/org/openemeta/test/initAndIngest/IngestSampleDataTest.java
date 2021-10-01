package org.openemeta.test.initAndIngest;

import org.openmetadata.test.operation.IngestSampleData;
import org.testng.annotations.Test;

import java.io.IOException;

public class IngestSampleDataTest {

    // RUN THIS TEST SECOND

    @Test
    public void ingestSampleData() throws IOException, InterruptedException {
        IngestSampleData.enableEnv();
        IngestSampleData.preInstall();
        IngestSampleData.sample_users();
        IngestSampleData.sample_data();
        IngestSampleData.sample_usage();
        IngestSampleData.esDocker();
        IngestSampleData.elasticSearch();
    }
}
