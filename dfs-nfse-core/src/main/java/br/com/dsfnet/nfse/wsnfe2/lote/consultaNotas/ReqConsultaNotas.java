//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.13 at 03:33:30 PM BRST 
//


package br.com.dsfnet.nfse.wsnfe2.lote.consultaNotas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.dsfnet.nfse.util.XMLGregorianCalendarAdapter;
//import org.w3._2000._09.xmldsig.SignatureType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cabecalho">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CodCidade" type="{http://localhost:8080/WsNFe2/tp}tpCodCidade"/>
 *                   &lt;element name="CPFCNPJRemetente" type="{http://localhost:8080/WsNFe2/tp}tpCPFCNPJ"/>
 *                   &lt;element name="InscricaoMunicipalPrestador" type="{http://localhost:8080/WsNFe2/tp}tpInscricaoMunicipal"/>
 *                   &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="dtFim" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="NotaInicial" type="{http://localhost:8080/WsNFe2/tp}tpNumero" minOccurs="0"/>
 *                   &lt;element name="Versao" type="{http://localhost:8080/WsNFe2/tp}tpVersao"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cabecalho"
})
@XmlRootElement(name = "ReqConsultaNotas", namespace = "http://localhost:8080/WsNFe2/lote")
public class ReqConsultaNotas {

    @XmlElement(name = "Cabecalho", required = true)
    protected ReqConsultaNotas.Cabecalho cabecalho;
//    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
//    protected SignatureType signature;

    /**
     * Gets the value of the cabecalho property.
     * 
     * @return
     *     possible object is
     *     {@link ReqConsultaNotas.Cabecalho }
     *     
     */
    public ReqConsultaNotas.Cabecalho getCabecalho() {
        return cabecalho;
    }

    /**
     * Sets the value of the cabecalho property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqConsultaNotas.Cabecalho }
     *     
     */
    public void setCabecalho(ReqConsultaNotas.Cabecalho value) {
        this.cabecalho = value;
    }

//    /**
//     * Gets the value of the signature property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link SignatureType }
//     *     
//     */
//    public SignatureType getSignature() {
//        return signature;
//    }
//
//    /**
//     * Sets the value of the signature property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link SignatureType }
//     *     
//     */
//    public void setSignature(SignatureType value) {
//        this.signature = value;
//    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CodCidade" type="{http://localhost:8080/WsNFe2/tp}tpCodCidade"/>
     *         &lt;element name="CPFCNPJRemetente" type="{http://localhost:8080/WsNFe2/tp}tpCPFCNPJ"/>
     *         &lt;element name="InscricaoMunicipalPrestador" type="{http://localhost:8080/WsNFe2/tp}tpInscricaoMunicipal"/>
     *         &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="dtFim" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="NotaInicial" type="{http://localhost:8080/WsNFe2/tp}tpNumero" minOccurs="0"/>
     *         &lt;element name="Versao" type="{http://localhost:8080/WsNFe2/tp}tpVersao"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codCidade",
        "cpfcnpjRemetente",
        "inscricaoMunicipalPrestador",
        "dtInicio",
        "dtFim",
        "notaInicial",
        "versao"
    })
    public static class Cabecalho {

        @XmlElement(name = "CodCidade")
        protected long codCidade;
        @XmlElement(name = "CPFCNPJRemetente", required = true)
        protected String cpfcnpjRemetente;
        @XmlElement(name = "InscricaoMunicipalPrestador")
        protected long inscricaoMunicipalPrestador;
        
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        @XmlJavaTypeAdapter(XMLGregorianCalendarAdapter.class)
        protected XMLGregorianCalendar dtInicio;
        
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        @XmlJavaTypeAdapter(XMLGregorianCalendarAdapter.class)
        protected XMLGregorianCalendar dtFim;
        
        @XmlElement(name = "NotaInicial")
        protected Integer notaInicial;
        @XmlElement(name = "Versao")
        protected long versao;
        @XmlAttribute(name = "Id")
        protected String id;

        /**
         * Gets the value of the codCidade property.
         * 
         */
        public long getCodCidade() {
            return codCidade;
        }

        /**
         * Sets the value of the codCidade property.
         * 
         */
        public void setCodCidade(long value) {
            this.codCidade = value;
        }

        /**
         * Gets the value of the cpfcnpjRemetente property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPFCNPJRemetente() {
            return cpfcnpjRemetente;
        }

        /**
         * Sets the value of the cpfcnpjRemetente property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPFCNPJRemetente(String value) {
            this.cpfcnpjRemetente = value;
        }

        /**
         * Gets the value of the inscricaoMunicipalPrestador property.
         * 
         */
        public long getInscricaoMunicipalPrestador() {
            return inscricaoMunicipalPrestador;
        }

        /**
         * Sets the value of the inscricaoMunicipalPrestador property.
         * 
         */
        public void setInscricaoMunicipalPrestador(long value) {
            this.inscricaoMunicipalPrestador = value;
        }

        /**
         * Gets the value of the dtInicio property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDtInicio() {
            return dtInicio;
        }

        /**
         * Sets the value of the dtInicio property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDtInicio(XMLGregorianCalendar value) {
            this.dtInicio = value;
        }

        /**
         * Gets the value of the dtFim property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDtFim() {
            return dtFim;
        }

        /**
         * Sets the value of the dtFim property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDtFim(XMLGregorianCalendar value) {
            this.dtFim = value;
        }

        /**
         * Gets the value of the notaInicial property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNotaInicial() {
            return notaInicial;
        }

        /**
         * Sets the value of the notaInicial property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNotaInicial(Integer value) {
            this.notaInicial = value;
        }

        /**
         * Gets the value of the versao property.
         * 
         */
        public long getVersao() {
            return versao;
        }

        /**
         * Sets the value of the versao property.
         * 
         */
        public void setVersao(long value) {
            this.versao = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
