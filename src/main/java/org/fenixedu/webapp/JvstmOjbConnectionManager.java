package org.fenixedu.webapp;

import java.sql.Connection;

import net.sourceforge.fenixedu.util.ConnectionManager;

import org.apache.ojb.broker.accesslayer.LookupException;

import pt.ist.fenixframework.backend.jvstmojb.pstm.TransactionSupport;

public class JvstmOjbConnectionManager extends ConnectionManager {

    @Override
    protected Connection getConnection() {
        try {
            return TransactionSupport.getOJBBroker().serviceConnectionManager().getConnection();
        } catch (LookupException e) {
            throw new Error(e);
        }
    }

}
