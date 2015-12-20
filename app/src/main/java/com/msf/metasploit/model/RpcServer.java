
package com.msf.metasploit.model;

import com.msf.metasploit.rpc.RpcConnection;

import java.io.IOException;

public class RpcServer extends SavedRpcServer {

    public static final int STATUS_NEW = 0;
    public static final int STATUS_CONNECTING = 1;
    public static final int STATUS_CONNECTION_FAILED = 2;
    public static final int STATUS_AUTHORISED = 3;
    public static final int STATUS_AUTHORISATION_FAILED = 4;

    public int status;
    public String rpcPassword;
    public RpcConnection rpcConnection;

    public int getStatus() {
        return status;
    }

    public void updateModel() throws IOException {
        rpcConnection.updateModel(this);
    }

    public MsfModel getModel() {
        return rpcConnection.getModel();
    }

}
