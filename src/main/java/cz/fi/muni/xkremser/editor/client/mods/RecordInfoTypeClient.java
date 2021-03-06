/*
 * Metadata Editor
 * @author Jiri Kremser
 * 
 * 
 * 
 * Metadata Editor - Rich internet application for editing metadata.
 * Copyright (C) 2011  Jiri Kremser (kremser@mzk.cz)
 * Moravian Library in Brno
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * 
 */
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.13 at 05:02:55 odp. CET 
//

package cz.fi.muni.xkremser.editor.client.mods;

import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

// TODO: Auto-generated Javadoc
/**
 * The Class RecordInfoTypeClient.
 */
public class RecordInfoTypeClient
        implements IsSerializable {

    /** The record content source. */
    protected List<StringPlusAuthorityPlusLanguageClient> recordContentSource;

    /** The record creation date. */
    protected List<DateTypeClient> recordCreationDate;

    /** The record change date. */
    protected List<DateTypeClient> recordChangeDate;

    /** The record identifier. */
    protected List<RecordIdentifierClient> recordIdentifier;

    /** The language of cataloging. */
    protected List<LanguageTypeClient> languageOfCataloging;

    /** The record origin. */
    protected List<String> recordOrigin;

    /** The description standard. */
    protected List<StringPlusAuthorityClient> descriptionStandard;

    /** The xml lang. */
    protected String xmlLang;

    /** The lang. */
    protected String lang;

    /** The script. */
    protected String script;

    /** The transliteration. */
    protected String transliteration;

    /**
     * Gets the record content source.
     * 
     * @return the record content source
     */
    public List<StringPlusAuthorityPlusLanguageClient> getRecordContentSource() {
        return recordContentSource;
    }

    /**
     * Sets the record content source.
     * 
     * @param recordContentSource
     *        the new record content source
     */
    public void setRecordContentSource(List<StringPlusAuthorityPlusLanguageClient> recordContentSource) {
        this.recordContentSource = recordContentSource;
    }

    /**
     * Gets the record creation date.
     * 
     * @return the record creation date
     */
    public List<DateTypeClient> getRecordCreationDate() {
        return recordCreationDate;
    }

    /**
     * Sets the record creation date.
     * 
     * @param recordCreationDate
     *        the new record creation date
     */
    public void setRecordCreationDate(List<DateTypeClient> recordCreationDate) {
        this.recordCreationDate = recordCreationDate;
    }

    /**
     * Gets the record change date.
     * 
     * @return the record change date
     */
    public List<DateTypeClient> getRecordChangeDate() {
        return recordChangeDate;
    }

    /**
     * Sets the record change date.
     * 
     * @param recordChangeDate
     *        the new record change date
     */
    public void setRecordChangeDate(List<DateTypeClient> recordChangeDate) {
        this.recordChangeDate = recordChangeDate;
    }

    /**
     * Gets the record identifier.
     * 
     * @return the record identifier
     */
    public List<RecordIdentifierClient> getRecordIdentifier() {
        return recordIdentifier;
    }

    /**
     * Sets the record identifier.
     * 
     * @param recordIdentifier
     *        the new record identifier
     */
    public void setRecordIdentifier(List<RecordIdentifierClient> recordIdentifier) {
        this.recordIdentifier = recordIdentifier;
    }

    /**
     * Gets the language of cataloging.
     * 
     * @return the language of cataloging
     */
    public List<LanguageTypeClient> getLanguageOfCataloging() {
        return languageOfCataloging;
    }

    /**
     * Sets the language of cataloging.
     * 
     * @param languageOfCataloging
     *        the new language of cataloging
     */
    public void setLanguageOfCataloging(List<LanguageTypeClient> languageOfCataloging) {
        this.languageOfCataloging = languageOfCataloging;
    }

    /**
     * Gets the record origin.
     * 
     * @return the record origin
     */
    public List<String> getRecordOrigin() {
        return recordOrigin;
    }

    /**
     * Sets the record origin.
     * 
     * @param recordOrigin
     *        the new record origin
     */
    public void setRecordOrigin(List<String> recordOrigin) {
        this.recordOrigin = recordOrigin;
    }

    /**
     * Gets the description standard.
     * 
     * @return the description standard
     */
    public List<StringPlusAuthorityClient> getDescriptionStandard() {
        return descriptionStandard;
    }

    /**
     * Sets the description standard.
     * 
     * @param descriptionStandard
     *        the new description standard
     */
    public void setDescriptionStandard(List<StringPlusAuthorityClient> descriptionStandard) {
        this.descriptionStandard = descriptionStandard;
    }

    /**
     * Gets the xml lang.
     * 
     * @return the xml lang
     */
    public String getXmlLang() {
        return xmlLang;
    }

    /**
     * Sets the xml lang.
     * 
     * @param xmlLang
     *        the new xml lang
     */
    public void setXmlLang(String xmlLang) {
        this.xmlLang = xmlLang;
    }

    /**
     * Gets the lang.
     * 
     * @return the lang
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the lang.
     * 
     * @param lang
     *        the new lang
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * Gets the script.
     * 
     * @return the script
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the script.
     * 
     * @param script
     *        the new script
     */
    public void setScript(String script) {
        this.script = script;
    }

    /**
     * Gets the transliteration.
     * 
     * @return the transliteration
     */
    public String getTransliteration() {
        return transliteration;
    }

    /**
     * Sets the transliteration.
     * 
     * @param transliteration
     *        the new transliteration
     */
    public void setTransliteration(String transliteration) {
        this.transliteration = transliteration;
    }

    /**
     * The Class RecordIdentifierClient.
     */
    public static class RecordIdentifierClient
            implements IsSerializable {

        /** The value. */
        protected String value;

        /** The source. */
        protected String source;

        /**
         * Gets the value of the value property.
         * 
         * @return possible object is {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *        allowed object is {@link String }
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return possible object is {@link String }
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *        allowed object is {@link String }
         */
        public void setSource(String value) {
            this.source = value;
        }

    }

}
