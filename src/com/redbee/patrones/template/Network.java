package com.redbee.patrones.template;

abstract class Network {
    protected String user = null;
    protected String pass = null;

    Network(String user, String pass){
        this.user = user;
        this.pass = pass;
    }

    public boolean post(String message) {
        // Authenticate before posting. Every network uses a different
        // authentication method.
        boolean result = false;
        if (logIn(this.user, this.pass)) {
            // Send the post data.
            result =  sendData(message.getBytes());
            logOut();
        }
        return result;
    }

    void setPass(String pass){
        this.pass = pass;
    }
    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
