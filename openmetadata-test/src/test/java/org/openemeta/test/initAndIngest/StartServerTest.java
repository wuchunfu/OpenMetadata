package org.openemeta.test.initAndIngest;

import org.openmetadata.test.operation.StartServer;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class StartServerTest {

    // RUN THIS TEST FIRST

    @Test
    public void startServer() throws IOException, InterruptedException {
        StartServer.gitClone();
        StartServer.mvnPackage();
        StartServer.unTar();
        StartServer.migrate();
        StartServer.startServer();
    }
}
