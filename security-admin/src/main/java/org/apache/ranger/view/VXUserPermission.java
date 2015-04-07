package org.apache.ranger.view;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.ranger.common.AppConstants;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, fieldVisibility = Visibility.ANY)
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class VXUserPermission extends VXDataObject implements
		java.io.Serializable {

	private static final long serialVersionUID = 1L;

	protected Long id;
	protected Long userId;
	protected Long moduleId;
	protected Integer isAllowed;
	protected String userName;
	protected String moduleName;
	protected String loginId;



	public VXUserPermission() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the moduleId
	 */
	public Long getModuleId() {
		return moduleId;
	}

	/**
	 * @param moduleId
	 *            the moduleId to set
	 */
	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	/**
	 * @return the isAllowed
	 */
	public Integer getIsAllowed() {
		return isAllowed;
	}

	/**
	 * @param isAllowed
	 *            the isAllowed to set
	 */
	public void setIsAllowed(Integer isAllowed) {
		this.isAllowed = isAllowed;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getLoginId() {
		return loginId;
	}


	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}


	@Override
	public int getMyClassType() {
		return AppConstants.CLASS_TYPE_RANGER_USER_PERMISSION;
	}

	@Override
	public String toString() {

		String str = "VXUserPermission={";
		str += super.toString();
		str += "id={" + id + "} ";
		str += "userId={" + userId + "} ";
		str += "moduleId={" + moduleId + "} ";
		str += "isAllowed={" + isAllowed + "} ";
		str += "moduleName={" + moduleName + "} ";
		str += "loginId={" + loginId + "} ";
		str += "}";

		return str;
	}
}