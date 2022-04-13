package is.idega.webservice.model;

import java.io.Serializable;

public class Token implements Serializable {

	private static final long serialVersionUID = 2990021991159092022L;

	private Long nbf;
	private Long exp;
	private Long iat;
	private Long auth_time;

	private String iss;
	private String aud;
	private String at_hash;
	private String s_hash;
	private String sid;
	private String sub;
	private String idp;
	private String nationalId;
	private String nat;
	private String subjectType;
	private String name;

	private String[] amr;

	public Long getNbf() {
		return nbf;
	}

	public void setNbf(Long nbf) {
		this.nbf = nbf;
	}

	public Long getExp() {
		return exp;
	}

	public void setExp(Long exp) {
		this.exp = exp;
	}

	public Long getIat() {
		return iat;
	}

	public void setIat(Long iat) {
		this.iat = iat;
	}

	public Long getAuth_time() {
		return auth_time;
	}

	public void setAuth_time(Long auth_time) {
		this.auth_time = auth_time;
	}

	public String getIss() {
		return iss;
	}

	public void setIss(String iss) {
		this.iss = iss;
	}

	public String getAud() {
		return aud;
	}

	public void setAud(String aud) {
		this.aud = aud;
	}

	public String getAt_hash() {
		return at_hash;
	}

	public void setAt_hash(String at_hash) {
		this.at_hash = at_hash;
	}

	public String getS_hash() {
		return s_hash;
	}

	public void setS_hash(String s_hash) {
		this.s_hash = s_hash;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getIdp() {
		return idp;
	}

	public void setIdp(String idp) {
		this.idp = idp;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getNat() {
		return nat;
	}

	public void setNat(String nat) {
		this.nat = nat;
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getAmr() {
		return amr;
	}

	public void setAmr(String[] amr) {
		this.amr = amr;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + ", personal ID: " + getNationalId();
	}

}