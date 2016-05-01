/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.performance_schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.example.gradle.db.performance_schema.enums.HostCacheHostValidated;
import org.jooq.example.gradle.db.performance_schema.tables.HostCache;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HostCacheRecord extends TableRecordImpl<HostCacheRecord> {

	private static final long serialVersionUID = -1613581387;

	/**
	 * Setter for <code>performance_schema.host_cache.IP</code>.
	 */
	public void setIp(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.IP</code>.
	 */
	public String getIp() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.HOST</code>.
	 */
	public void setHost(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.HOST</code>.
	 */
	public String getHost() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.HOST_VALIDATED</code>.
	 */
	public void setHostValidated(HostCacheHostValidated value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.HOST_VALIDATED</code>.
	 */
	public HostCacheHostValidated getHostValidated() {
		return (HostCacheHostValidated) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.SUM_CONNECT_ERRORS</code>.
	 */
	public void setSumConnectErrors(Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.SUM_CONNECT_ERRORS</code>.
	 */
	public Long getSumConnectErrors() {
		return (Long) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_HOST_BLOCKED_ERRORS</code>.
	 */
	public void setCountHostBlockedErrors(Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_HOST_BLOCKED_ERRORS</code>.
	 */
	public Long getCountHostBlockedErrors() {
		return (Long) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_NAMEINFO_TRANSIENT_ERRORS</code>.
	 */
	public void setCountNameinfoTransientErrors(Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_NAMEINFO_TRANSIENT_ERRORS</code>.
	 */
	public Long getCountNameinfoTransientErrors() {
		return (Long) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_NAMEINFO_PERMANENT_ERRORS</code>.
	 */
	public void setCountNameinfoPermanentErrors(Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_NAMEINFO_PERMANENT_ERRORS</code>.
	 */
	public Long getCountNameinfoPermanentErrors() {
		return (Long) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_FORMAT_ERRORS</code>.
	 */
	public void setCountFormatErrors(Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_FORMAT_ERRORS</code>.
	 */
	public Long getCountFormatErrors() {
		return (Long) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_ADDRINFO_TRANSIENT_ERRORS</code>.
	 */
	public void setCountAddrinfoTransientErrors(Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_ADDRINFO_TRANSIENT_ERRORS</code>.
	 */
	public Long getCountAddrinfoTransientErrors() {
		return (Long) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_ADDRINFO_PERMANENT_ERRORS</code>.
	 */
	public void setCountAddrinfoPermanentErrors(Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_ADDRINFO_PERMANENT_ERRORS</code>.
	 */
	public Long getCountAddrinfoPermanentErrors() {
		return (Long) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_FCRDNS_ERRORS</code>.
	 */
	public void setCountFcrdnsErrors(Long value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_FCRDNS_ERRORS</code>.
	 */
	public Long getCountFcrdnsErrors() {
		return (Long) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_HOST_ACL_ERRORS</code>.
	 */
	public void setCountHostAclErrors(Long value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_HOST_ACL_ERRORS</code>.
	 */
	public Long getCountHostAclErrors() {
		return (Long) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_NO_AUTH_PLUGIN_ERRORS</code>.
	 */
	public void setCountNoAuthPluginErrors(Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_NO_AUTH_PLUGIN_ERRORS</code>.
	 */
	public Long getCountNoAuthPluginErrors() {
		return (Long) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_AUTH_PLUGIN_ERRORS</code>.
	 */
	public void setCountAuthPluginErrors(Long value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_AUTH_PLUGIN_ERRORS</code>.
	 */
	public Long getCountAuthPluginErrors() {
		return (Long) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_HANDSHAKE_ERRORS</code>.
	 */
	public void setCountHandshakeErrors(Long value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_HANDSHAKE_ERRORS</code>.
	 */
	public Long getCountHandshakeErrors() {
		return (Long) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_PROXY_USER_ERRORS</code>.
	 */
	public void setCountProxyUserErrors(Long value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_PROXY_USER_ERRORS</code>.
	 */
	public Long getCountProxyUserErrors() {
		return (Long) getValue(15);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_PROXY_USER_ACL_ERRORS</code>.
	 */
	public void setCountProxyUserAclErrors(Long value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_PROXY_USER_ACL_ERRORS</code>.
	 */
	public Long getCountProxyUserAclErrors() {
		return (Long) getValue(16);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_AUTHENTICATION_ERRORS</code>.
	 */
	public void setCountAuthenticationErrors(Long value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_AUTHENTICATION_ERRORS</code>.
	 */
	public Long getCountAuthenticationErrors() {
		return (Long) getValue(17);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_SSL_ERRORS</code>.
	 */
	public void setCountSslErrors(Long value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_SSL_ERRORS</code>.
	 */
	public Long getCountSslErrors() {
		return (Long) getValue(18);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_MAX_USER_CONNECTIONS_ERRORS</code>.
	 */
	public void setCountMaxUserConnectionsErrors(Long value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_MAX_USER_CONNECTIONS_ERRORS</code>.
	 */
	public Long getCountMaxUserConnectionsErrors() {
		return (Long) getValue(19);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS</code>.
	 */
	public void setCountMaxUserConnectionsPerHourErrors(Long value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS</code>.
	 */
	public Long getCountMaxUserConnectionsPerHourErrors() {
		return (Long) getValue(20);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_DEFAULT_DATABASE_ERRORS</code>.
	 */
	public void setCountDefaultDatabaseErrors(Long value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_DEFAULT_DATABASE_ERRORS</code>.
	 */
	public Long getCountDefaultDatabaseErrors() {
		return (Long) getValue(21);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_INIT_CONNECT_ERRORS</code>.
	 */
	public void setCountInitConnectErrors(Long value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_INIT_CONNECT_ERRORS</code>.
	 */
	public Long getCountInitConnectErrors() {
		return (Long) getValue(22);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_LOCAL_ERRORS</code>.
	 */
	public void setCountLocalErrors(Long value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_LOCAL_ERRORS</code>.
	 */
	public Long getCountLocalErrors() {
		return (Long) getValue(23);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.COUNT_UNKNOWN_ERRORS</code>.
	 */
	public void setCountUnknownErrors(Long value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.COUNT_UNKNOWN_ERRORS</code>.
	 */
	public Long getCountUnknownErrors() {
		return (Long) getValue(24);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.FIRST_SEEN</code>.
	 */
	public void setFirstSeen(Timestamp value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.FIRST_SEEN</code>.
	 */
	public Timestamp getFirstSeen() {
		return (Timestamp) getValue(25);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.LAST_SEEN</code>.
	 */
	public void setLastSeen(Timestamp value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.LAST_SEEN</code>.
	 */
	public Timestamp getLastSeen() {
		return (Timestamp) getValue(26);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.FIRST_ERROR_SEEN</code>.
	 */
	public void setFirstErrorSeen(Timestamp value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.FIRST_ERROR_SEEN</code>.
	 */
	public Timestamp getFirstErrorSeen() {
		return (Timestamp) getValue(27);
	}

	/**
	 * Setter for <code>performance_schema.host_cache.LAST_ERROR_SEEN</code>.
	 */
	public void setLastErrorSeen(Timestamp value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>performance_schema.host_cache.LAST_ERROR_SEEN</code>.
	 */
	public Timestamp getLastErrorSeen() {
		return (Timestamp) getValue(28);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached HostCacheRecord
	 */
	public HostCacheRecord() {
		super(HostCache.HOST_CACHE);
	}

	/**
	 * Create a detached, initialised HostCacheRecord
	 */
	public HostCacheRecord(String ip, String host, HostCacheHostValidated hostValidated, Long sumConnectErrors, Long countHostBlockedErrors, Long countNameinfoTransientErrors, Long countNameinfoPermanentErrors, Long countFormatErrors, Long countAddrinfoTransientErrors, Long countAddrinfoPermanentErrors, Long countFcrdnsErrors, Long countHostAclErrors, Long countNoAuthPluginErrors, Long countAuthPluginErrors, Long countHandshakeErrors, Long countProxyUserErrors, Long countProxyUserAclErrors, Long countAuthenticationErrors, Long countSslErrors, Long countMaxUserConnectionsErrors, Long countMaxUserConnectionsPerHourErrors, Long countDefaultDatabaseErrors, Long countInitConnectErrors, Long countLocalErrors, Long countUnknownErrors, Timestamp firstSeen, Timestamp lastSeen, Timestamp firstErrorSeen, Timestamp lastErrorSeen) {
		super(HostCache.HOST_CACHE);

		setValue(0, ip);
		setValue(1, host);
		setValue(2, hostValidated);
		setValue(3, sumConnectErrors);
		setValue(4, countHostBlockedErrors);
		setValue(5, countNameinfoTransientErrors);
		setValue(6, countNameinfoPermanentErrors);
		setValue(7, countFormatErrors);
		setValue(8, countAddrinfoTransientErrors);
		setValue(9, countAddrinfoPermanentErrors);
		setValue(10, countFcrdnsErrors);
		setValue(11, countHostAclErrors);
		setValue(12, countNoAuthPluginErrors);
		setValue(13, countAuthPluginErrors);
		setValue(14, countHandshakeErrors);
		setValue(15, countProxyUserErrors);
		setValue(16, countProxyUserAclErrors);
		setValue(17, countAuthenticationErrors);
		setValue(18, countSslErrors);
		setValue(19, countMaxUserConnectionsErrors);
		setValue(20, countMaxUserConnectionsPerHourErrors);
		setValue(21, countDefaultDatabaseErrors);
		setValue(22, countInitConnectErrors);
		setValue(23, countLocalErrors);
		setValue(24, countUnknownErrors);
		setValue(25, firstSeen);
		setValue(26, lastSeen);
		setValue(27, firstErrorSeen);
		setValue(28, lastErrorSeen);
	}
}
