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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.ValueType;

// Start of user code imports
// End of user code

@OslcNamespace(SimulinkAdaptorConstants.SIMULINK_NAMSPACE)
@OslcName(SimulinkAdaptorConstants.SIMULINKMODELRESOURCE)
@OslcResourceShape(title = "SimulinkModelResource Resource Shape", describes = SimulinkAdaptorConstants.TYPE_SIMULINKMODELRESOURCE)
public class SimulinkModelResource extends SimulinkElementResource

{

    private String        version;
    private HashSet<Link> containss = new HashSet<Link>();
    private String        file;
    private Boolean       library;

    public SimulinkModelResource() throws URISyntaxException {
        super();

        // Start of user code constructor1
        // End of user code
    }

    public SimulinkModelResource(final URI about) throws URISyntaxException {
        super(about);

        // Start of user code constructor2
        // End of user code
    }

    public static URI constructURI(final String simulinkModel) {
        String basePath = ServletListener.getServicesBase();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("simulinkModel", simulinkModel);
        String instanceURI = "simulinkModelResources/{simulinkModel}";

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

    public void addContains(final Link contains) {
        this.containss.add(contains);
    }

    @OslcName("version")
    @OslcPropertyDefinition(SimulinkAdaptorConstants.SIMULINK_NAMSPACE + "version")
    @OslcDescription("")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    @OslcTitle("version")
    public String getVersion() {
        return version;
    }

    @OslcName("contains")
    @OslcPropertyDefinition(SimulinkAdaptorConstants.SIMULINK_NAMSPACE + "contains")
    @OslcDescription("")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange(SimulinkAdaptorConstants.TYPE_BLOCKRESOURCE)
    @OslcReadOnly(false)
    @OslcTitle("contains")
    public HashSet<Link> getContainss() {
        return containss;
    }

    @OslcName("file")
    @OslcPropertyDefinition(SimulinkAdaptorConstants.SIMULINK_NAMSPACE + "file")
    @OslcDescription("")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    @OslcTitle("file")
    public String getFile() {
        return file;
    }

    @OslcName("library")
    @OslcPropertyDefinition(SimulinkAdaptorConstants.SIMULINK_NAMSPACE + "library")
    @OslcDescription("")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    @OslcTitle("library")
    public Boolean isLibrary() {
        return library;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public void setContainss(final HashSet<Link> contains) {
        this.containss.clear();
        if (contains != null) {
            this.containss.addAll(contains);
        }

    }

    public void setFile(final String file) {
        this.file = file;
    }

    public void setLibrary(final Boolean library) {
        this.library = library;
    }

    static public String versionToHtmlForCreation(final HttpServletRequest httpServletRequest) {
        String s = "";

        // Start of user code versionasHtmlForCreation_init
        // End of user code

        s = s + "<label for=\"version\">version: </LABEL>";

        // Start of user code versionasHtmlForCreation_mid
        // End of user code

        s = s + "<input name=\"version\" type=\"text\" style=\"width: 400px\" id=\"version\" >";

        // Start of user code versionasHtmlForCreation_finalize
        // End of user code

        return s;
    }

    static public String containssToHtmlForCreation(final HttpServletRequest httpServletRequest) {
        String s = "";

        // Start of user code containssasHtmlForCreation_init
        // End of user code

        s = s + "<label for=\"contains\">contains: </LABEL>";

        // Start of user code containssasHtmlForCreation_mid
        // End of user code

        // Start of user code containssasHtmlForCreation_finalize
        // End of user code

        return s;
    }

    static public String fileToHtmlForCreation(final HttpServletRequest httpServletRequest) {
        String s = "";

        // Start of user code fileasHtmlForCreation_init
        // End of user code

        s = s + "<label for=\"file\">file: </LABEL>";

        // Start of user code fileasHtmlForCreation_mid
        // End of user code

        s = s + "<input name=\"file\" type=\"text\" style=\"width: 400px\" id=\"file\" >";

        // Start of user code fileasHtmlForCreation_finalize
        // End of user code

        return s;
    }

    static public String libraryToHtmlForCreation(final HttpServletRequest httpServletRequest) {
        String s = "";

        // Start of user code libraryasHtmlForCreation_init
        // End of user code

        s = s + "<label for=\"library\">library: </LABEL>";

        // Start of user code libraryasHtmlForCreation_mid
        // End of user code

        s = s
                + "<input name=\"library\" type=\"radio\" value=\"true\">True<br><input name=\"library\" type=\"radio\" value=\"false\">False";

        // Start of user code libraryasHtmlForCreation_finalize
        // End of user code

        return s;
    }

    public String versionToHtml() {
        String s = "";

        // Start of user code versiontoHtml_init
        // End of user code

        s = s + "<label for=\"version\"><strong>version</strong>: </LABEL>";

        // Start of user code versiontoHtml_mid
        // End of user code

        try {
            if (version == null) {
                s = s + "<em>null</em>";
            } else {
                s = s + version.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Start of user code versiontoHtml_finalize
        // End of user code

        return s;
    }

    public String containssToHtml() {
        String s = "";

        // Start of user code containsstoHtml_init
        // End of user code

        s = s + "<label for=\"contains\"><strong>contains</strong>: </LABEL>";

        // Start of user code containsstoHtml_mid
        // End of user code

        try {
            s = s + "<ul>";
            Iterator<Link> itr = containss.iterator();
            while (itr.hasNext()) {
                s = s + "<li>";
                s = s + (new BlockResource(itr.next().getValue())).toHtml();
                s = s + "</li>";
            }
            s = s + "</ul>";
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Start of user code containsstoHtml_finalize
        // End of user code

        return s;
    }

    public String fileToHtml() {
        String s = "";

        // Start of user code filetoHtml_init
        // End of user code

        s = s + "<label for=\"file\"><strong>file</strong>: </LABEL>";

        // Start of user code filetoHtml_mid
        // End of user code

        try {
            if (file == null) {
                s = s + "<em>null</em>";
            } else {
                s = s + file.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Start of user code filetoHtml_finalize
        // End of user code

        return s;
    }

    public String libraryToHtml() {
        String s = "";

        // Start of user code librarytoHtml_init
        // End of user code

        s = s + "<label for=\"library\"><strong>library</strong>: </LABEL>";

        // Start of user code librarytoHtml_mid
        // End of user code

        try {
            if (library == null) {
                s = s + "<em>null</em>";
            } else {
                s = s + library.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Start of user code librarytoHtml_finalize
        // End of user code

        return s;
    }

}
