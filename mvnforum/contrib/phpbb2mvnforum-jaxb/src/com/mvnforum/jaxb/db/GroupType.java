//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.12.17 at 09:43:27 AM GMT+07:00 
//


package com.mvnforum.jaxb.db;


/**
 * Java content class for GroupType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/D:/working/mvnforum/contrib/phpbb2mvnforum-jaxb/schema/mvnforum.xsd line 40)
 * <p>
 * <pre>
 * &lt;complexType name="GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GroupDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupOption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GroupCreationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalPermissionList" type="{}GlobalPermissionList" minOccurs="0"/>
 *         &lt;element name="GroupMemberList" type="{}GroupMemberList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface GroupType {


    /**
     * Gets the value of the groupOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getGroupOwnerName();

    /**
     * Sets the value of the groupOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setGroupOwnerName(java.lang.String value);

    /**
     * Gets the value of the groupCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getGroupCreationDate();

    /**
     * Sets the value of the groupCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setGroupCreationDate(java.lang.String value);

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getGroupName();

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setGroupName(java.lang.String value);

    /**
     * Gets the value of the groupMemberList property.
     * 
     * @return
     *     possible object is
     *     {@link com.mvnforum.jaxb.db.GroupMemberList}
     */
    com.mvnforum.jaxb.db.GroupMemberList getGroupMemberList();

    /**
     * Sets the value of the groupMemberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mvnforum.jaxb.db.GroupMemberList}
     */
    void setGroupMemberList(com.mvnforum.jaxb.db.GroupMemberList value);

    /**
     * Gets the value of the groupModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getGroupModifiedDate();

    /**
     * Sets the value of the groupModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setGroupModifiedDate(java.lang.String value);

    /**
     * Gets the value of the groupOption property.
     * 
     */
    int getGroupOption();

    /**
     * Sets the value of the groupOption property.
     * 
     */
    void setGroupOption(int value);

    /**
     * Gets the value of the globalPermissionList property.
     * 
     * @return
     *     possible object is
     *     {@link com.mvnforum.jaxb.db.GlobalPermissionList}
     */
    com.mvnforum.jaxb.db.GlobalPermissionList getGlobalPermissionList();

    /**
     * Sets the value of the globalPermissionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mvnforum.jaxb.db.GlobalPermissionList}
     */
    void setGlobalPermissionList(com.mvnforum.jaxb.db.GlobalPermissionList value);

    /**
     * Gets the value of the groupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getGroupDesc();

    /**
     * Sets the value of the groupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setGroupDesc(java.lang.String value);

}