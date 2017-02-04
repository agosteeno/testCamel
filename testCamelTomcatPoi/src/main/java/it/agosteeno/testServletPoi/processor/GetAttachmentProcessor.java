package it.agosteeno.testServletPoi.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;

/**
 * Created by agosteeno on 04/02/2017.
 */
public class GetAttachmentProcessor implements Processor {

    private static final Log LOG = LogFactory.getLog(GetAttachmentProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {

        Message message = exchange.getIn();

        Object attachmentObject = message.getAttachment("Ferie_Leoni_2014.xls");

        
    }
}
