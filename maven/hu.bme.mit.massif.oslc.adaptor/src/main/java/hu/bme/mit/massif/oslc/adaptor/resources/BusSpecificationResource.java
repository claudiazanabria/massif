/*******************************************************************************
 * Copyright (c) 2012, 2014 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *	   Sam Padgett	       - initial API and implementation
 *     Michael Fiedler     - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/

package hu.bme.mit.massif.oslc.adaptor.resources;

import hu.bme.mit.massif.oslc.adaptor.SimulinkAdaptorConstants;
import hu.bme.mit.massif.oslc.adaptor.servlet.ServletListener;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;

// Start of user code imports
// End of user code

@OslcNamespace(SimulinkAdaptorConstants.SIMULINK_NAMSPACE)
@OslcName(SimulinkAdaptorConstants.BUSSPECIFICATIONRESOURCE)
@OslcResourceShape(title = "BusSpecificationResource Resource Shape", describes = SimulinkAdaptorConstants.TYPE_BUSSPECIFICATIONRESOURCE)
public class BusSpecificationResource extends BlockResource

{

    public BusSpecificationResource() throws URISyntaxException {
        super();

        // Start of user code constructor1
        // End of user code
    }

    public BusSpecificationResource(final URI about) throws URISyntaxException {
        super(about);

        // Start of user code constructor2
        // End of user code
    }

    public static URI constructURI(final String serviceProviderId, final String busSpecId) {
        String basePath = ServletListener.getServicesBase();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("serviceProviderId", serviceProviderId);

        pathParameters.put("busSpecId", busSpecId);
        String instanceURI = "/simu/{serviceProviderId}/busSpecificationResources/{busSpecId}";

        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }

    public String toString() {
        String result = "";
        // Start of user code toString_init
        if (getAbout() == null) {
            return result;
        }
        // End of user code

        result = getAbout().toString();

        // Start of user code toString_finalize
        // End of user code

        return result;
    }

    public String toHtml() {
        String result = "";
        // Start of user code toHtml_init
        // End of user code

        result = "<a href=\"" + getAbout() + "\">" + toString() + "</a>";

        // Start of user code toHtml_finalize
        // End of user code

        return result;
    }

}
