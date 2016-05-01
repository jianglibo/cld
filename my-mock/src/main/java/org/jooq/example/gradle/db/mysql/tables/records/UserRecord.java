/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.mysql.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record2;
import org.jooq.example.gradle.db.mysql.enums.UserAccountLocked;
import org.jooq.example.gradle.db.mysql.enums.UserAlterPriv;
import org.jooq.example.gradle.db.mysql.enums.UserAlterRoutinePriv;
import org.jooq.example.gradle.db.mysql.enums.UserCreatePriv;
import org.jooq.example.gradle.db.mysql.enums.UserCreateRoutinePriv;
import org.jooq.example.gradle.db.mysql.enums.UserCreateTablespacePriv;
import org.jooq.example.gradle.db.mysql.enums.UserCreateTmpTablePriv;
import org.jooq.example.gradle.db.mysql.enums.UserCreateUserPriv;
import org.jooq.example.gradle.db.mysql.enums.UserCreateViewPriv;
import org.jooq.example.gradle.db.mysql.enums.UserDeletePriv;
import org.jooq.example.gradle.db.mysql.enums.UserDropPriv;
import org.jooq.example.gradle.db.mysql.enums.UserEventPriv;
import org.jooq.example.gradle.db.mysql.enums.UserExecutePriv;
import org.jooq.example.gradle.db.mysql.enums.UserFilePriv;
import org.jooq.example.gradle.db.mysql.enums.UserGrantPriv;
import org.jooq.example.gradle.db.mysql.enums.UserIndexPriv;
import org.jooq.example.gradle.db.mysql.enums.UserInsertPriv;
import org.jooq.example.gradle.db.mysql.enums.UserLockTablesPriv;
import org.jooq.example.gradle.db.mysql.enums.UserPasswordExpired;
import org.jooq.example.gradle.db.mysql.enums.UserProcessPriv;
import org.jooq.example.gradle.db.mysql.enums.UserReferencesPriv;
import org.jooq.example.gradle.db.mysql.enums.UserReloadPriv;
import org.jooq.example.gradle.db.mysql.enums.UserReplClientPriv;
import org.jooq.example.gradle.db.mysql.enums.UserReplSlavePriv;
import org.jooq.example.gradle.db.mysql.enums.UserSelectPriv;
import org.jooq.example.gradle.db.mysql.enums.UserShowDbPriv;
import org.jooq.example.gradle.db.mysql.enums.UserShowViewPriv;
import org.jooq.example.gradle.db.mysql.enums.UserShutdownPriv;
import org.jooq.example.gradle.db.mysql.enums.UserSslType;
import org.jooq.example.gradle.db.mysql.enums.UserSuperPriv;
import org.jooq.example.gradle.db.mysql.enums.UserTriggerPriv;
import org.jooq.example.gradle.db.mysql.enums.UserUpdatePriv;
import org.jooq.example.gradle.db.mysql.tables.User;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


/**
 * Users and global privileges
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> {

	private static final long serialVersionUID = -884975412;

	/**
	 * Setter for <code>mysql.user.Host</code>.
	 */
	public void setHost(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.user.Host</code>.
	 */
	public String getHost() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>mysql.user.User</code>.
	 */
	public void setUser(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.user.User</code>.
	 */
	public String getUser() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>mysql.user.Select_priv</code>.
	 */
	public void setSelectPriv(UserSelectPriv value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.user.Select_priv</code>.
	 */
	public UserSelectPriv getSelectPriv() {
		return (UserSelectPriv) getValue(2);
	}

	/**
	 * Setter for <code>mysql.user.Insert_priv</code>.
	 */
	public void setInsertPriv(UserInsertPriv value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.user.Insert_priv</code>.
	 */
	public UserInsertPriv getInsertPriv() {
		return (UserInsertPriv) getValue(3);
	}

	/**
	 * Setter for <code>mysql.user.Update_priv</code>.
	 */
	public void setUpdatePriv(UserUpdatePriv value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mysql.user.Update_priv</code>.
	 */
	public UserUpdatePriv getUpdatePriv() {
		return (UserUpdatePriv) getValue(4);
	}

	/**
	 * Setter for <code>mysql.user.Delete_priv</code>.
	 */
	public void setDeletePriv(UserDeletePriv value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mysql.user.Delete_priv</code>.
	 */
	public UserDeletePriv getDeletePriv() {
		return (UserDeletePriv) getValue(5);
	}

	/**
	 * Setter for <code>mysql.user.Create_priv</code>.
	 */
	public void setCreatePriv(UserCreatePriv value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>mysql.user.Create_priv</code>.
	 */
	public UserCreatePriv getCreatePriv() {
		return (UserCreatePriv) getValue(6);
	}

	/**
	 * Setter for <code>mysql.user.Drop_priv</code>.
	 */
	public void setDropPriv(UserDropPriv value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>mysql.user.Drop_priv</code>.
	 */
	public UserDropPriv getDropPriv() {
		return (UserDropPriv) getValue(7);
	}

	/**
	 * Setter for <code>mysql.user.Reload_priv</code>.
	 */
	public void setReloadPriv(UserReloadPriv value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>mysql.user.Reload_priv</code>.
	 */
	public UserReloadPriv getReloadPriv() {
		return (UserReloadPriv) getValue(8);
	}

	/**
	 * Setter for <code>mysql.user.Shutdown_priv</code>.
	 */
	public void setShutdownPriv(UserShutdownPriv value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>mysql.user.Shutdown_priv</code>.
	 */
	public UserShutdownPriv getShutdownPriv() {
		return (UserShutdownPriv) getValue(9);
	}

	/**
	 * Setter for <code>mysql.user.Process_priv</code>.
	 */
	public void setProcessPriv(UserProcessPriv value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>mysql.user.Process_priv</code>.
	 */
	public UserProcessPriv getProcessPriv() {
		return (UserProcessPriv) getValue(10);
	}

	/**
	 * Setter for <code>mysql.user.File_priv</code>.
	 */
	public void setFilePriv(UserFilePriv value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>mysql.user.File_priv</code>.
	 */
	public UserFilePriv getFilePriv() {
		return (UserFilePriv) getValue(11);
	}

	/**
	 * Setter for <code>mysql.user.Grant_priv</code>.
	 */
	public void setGrantPriv(UserGrantPriv value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>mysql.user.Grant_priv</code>.
	 */
	public UserGrantPriv getGrantPriv() {
		return (UserGrantPriv) getValue(12);
	}

	/**
	 * Setter for <code>mysql.user.References_priv</code>.
	 */
	public void setReferencesPriv(UserReferencesPriv value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>mysql.user.References_priv</code>.
	 */
	public UserReferencesPriv getReferencesPriv() {
		return (UserReferencesPriv) getValue(13);
	}

	/**
	 * Setter for <code>mysql.user.Index_priv</code>.
	 */
	public void setIndexPriv(UserIndexPriv value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>mysql.user.Index_priv</code>.
	 */
	public UserIndexPriv getIndexPriv() {
		return (UserIndexPriv) getValue(14);
	}

	/**
	 * Setter for <code>mysql.user.Alter_priv</code>.
	 */
	public void setAlterPriv(UserAlterPriv value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>mysql.user.Alter_priv</code>.
	 */
	public UserAlterPriv getAlterPriv() {
		return (UserAlterPriv) getValue(15);
	}

	/**
	 * Setter for <code>mysql.user.Show_db_priv</code>.
	 */
	public void setShowDbPriv(UserShowDbPriv value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>mysql.user.Show_db_priv</code>.
	 */
	public UserShowDbPriv getShowDbPriv() {
		return (UserShowDbPriv) getValue(16);
	}

	/**
	 * Setter for <code>mysql.user.Super_priv</code>.
	 */
	public void setSuperPriv(UserSuperPriv value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>mysql.user.Super_priv</code>.
	 */
	public UserSuperPriv getSuperPriv() {
		return (UserSuperPriv) getValue(17);
	}

	/**
	 * Setter for <code>mysql.user.Create_tmp_table_priv</code>.
	 */
	public void setCreateTmpTablePriv(UserCreateTmpTablePriv value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>mysql.user.Create_tmp_table_priv</code>.
	 */
	public UserCreateTmpTablePriv getCreateTmpTablePriv() {
		return (UserCreateTmpTablePriv) getValue(18);
	}

	/**
	 * Setter for <code>mysql.user.Lock_tables_priv</code>.
	 */
	public void setLockTablesPriv(UserLockTablesPriv value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>mysql.user.Lock_tables_priv</code>.
	 */
	public UserLockTablesPriv getLockTablesPriv() {
		return (UserLockTablesPriv) getValue(19);
	}

	/**
	 * Setter for <code>mysql.user.Execute_priv</code>.
	 */
	public void setExecutePriv(UserExecutePriv value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>mysql.user.Execute_priv</code>.
	 */
	public UserExecutePriv getExecutePriv() {
		return (UserExecutePriv) getValue(20);
	}

	/**
	 * Setter for <code>mysql.user.Repl_slave_priv</code>.
	 */
	public void setReplSlavePriv(UserReplSlavePriv value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>mysql.user.Repl_slave_priv</code>.
	 */
	public UserReplSlavePriv getReplSlavePriv() {
		return (UserReplSlavePriv) getValue(21);
	}

	/**
	 * Setter for <code>mysql.user.Repl_client_priv</code>.
	 */
	public void setReplClientPriv(UserReplClientPriv value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>mysql.user.Repl_client_priv</code>.
	 */
	public UserReplClientPriv getReplClientPriv() {
		return (UserReplClientPriv) getValue(22);
	}

	/**
	 * Setter for <code>mysql.user.Create_view_priv</code>.
	 */
	public void setCreateViewPriv(UserCreateViewPriv value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>mysql.user.Create_view_priv</code>.
	 */
	public UserCreateViewPriv getCreateViewPriv() {
		return (UserCreateViewPriv) getValue(23);
	}

	/**
	 * Setter for <code>mysql.user.Show_view_priv</code>.
	 */
	public void setShowViewPriv(UserShowViewPriv value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>mysql.user.Show_view_priv</code>.
	 */
	public UserShowViewPriv getShowViewPriv() {
		return (UserShowViewPriv) getValue(24);
	}

	/**
	 * Setter for <code>mysql.user.Create_routine_priv</code>.
	 */
	public void setCreateRoutinePriv(UserCreateRoutinePriv value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>mysql.user.Create_routine_priv</code>.
	 */
	public UserCreateRoutinePriv getCreateRoutinePriv() {
		return (UserCreateRoutinePriv) getValue(25);
	}

	/**
	 * Setter for <code>mysql.user.Alter_routine_priv</code>.
	 */
	public void setAlterRoutinePriv(UserAlterRoutinePriv value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>mysql.user.Alter_routine_priv</code>.
	 */
	public UserAlterRoutinePriv getAlterRoutinePriv() {
		return (UserAlterRoutinePriv) getValue(26);
	}

	/**
	 * Setter for <code>mysql.user.Create_user_priv</code>.
	 */
	public void setCreateUserPriv(UserCreateUserPriv value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>mysql.user.Create_user_priv</code>.
	 */
	public UserCreateUserPriv getCreateUserPriv() {
		return (UserCreateUserPriv) getValue(27);
	}

	/**
	 * Setter for <code>mysql.user.Event_priv</code>.
	 */
	public void setEventPriv(UserEventPriv value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>mysql.user.Event_priv</code>.
	 */
	public UserEventPriv getEventPriv() {
		return (UserEventPriv) getValue(28);
	}

	/**
	 * Setter for <code>mysql.user.Trigger_priv</code>.
	 */
	public void setTriggerPriv(UserTriggerPriv value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>mysql.user.Trigger_priv</code>.
	 */
	public UserTriggerPriv getTriggerPriv() {
		return (UserTriggerPriv) getValue(29);
	}

	/**
	 * Setter for <code>mysql.user.Create_tablespace_priv</code>.
	 */
	public void setCreateTablespacePriv(UserCreateTablespacePriv value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>mysql.user.Create_tablespace_priv</code>.
	 */
	public UserCreateTablespacePriv getCreateTablespacePriv() {
		return (UserCreateTablespacePriv) getValue(30);
	}

	/**
	 * Setter for <code>mysql.user.ssl_type</code>.
	 */
	public void setSslType(UserSslType value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>mysql.user.ssl_type</code>.
	 */
	public UserSslType getSslType() {
		return (UserSslType) getValue(31);
	}

	/**
	 * Setter for <code>mysql.user.ssl_cipher</code>.
	 */
	public void setSslCipher(byte[] value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>mysql.user.ssl_cipher</code>.
	 */
	public byte[] getSslCipher() {
		return (byte[]) getValue(32);
	}

	/**
	 * Setter for <code>mysql.user.x509_issuer</code>.
	 */
	public void setX509Issuer(byte[] value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>mysql.user.x509_issuer</code>.
	 */
	public byte[] getX509Issuer() {
		return (byte[]) getValue(33);
	}

	/**
	 * Setter for <code>mysql.user.x509_subject</code>.
	 */
	public void setX509Subject(byte[] value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>mysql.user.x509_subject</code>.
	 */
	public byte[] getX509Subject() {
		return (byte[]) getValue(34);
	}

	/**
	 * Setter for <code>mysql.user.max_questions</code>.
	 */
	public void setMaxQuestions(UInteger value) {
		setValue(35, value);
	}

	/**
	 * Getter for <code>mysql.user.max_questions</code>.
	 */
	public UInteger getMaxQuestions() {
		return (UInteger) getValue(35);
	}

	/**
	 * Setter for <code>mysql.user.max_updates</code>.
	 */
	public void setMaxUpdates(UInteger value) {
		setValue(36, value);
	}

	/**
	 * Getter for <code>mysql.user.max_updates</code>.
	 */
	public UInteger getMaxUpdates() {
		return (UInteger) getValue(36);
	}

	/**
	 * Setter for <code>mysql.user.max_connections</code>.
	 */
	public void setMaxConnections(UInteger value) {
		setValue(37, value);
	}

	/**
	 * Getter for <code>mysql.user.max_connections</code>.
	 */
	public UInteger getMaxConnections() {
		return (UInteger) getValue(37);
	}

	/**
	 * Setter for <code>mysql.user.max_user_connections</code>.
	 */
	public void setMaxUserConnections(UInteger value) {
		setValue(38, value);
	}

	/**
	 * Getter for <code>mysql.user.max_user_connections</code>.
	 */
	public UInteger getMaxUserConnections() {
		return (UInteger) getValue(38);
	}

	/**
	 * Setter for <code>mysql.user.plugin</code>.
	 */
	public void setPlugin(String value) {
		setValue(39, value);
	}

	/**
	 * Getter for <code>mysql.user.plugin</code>.
	 */
	public String getPlugin() {
		return (String) getValue(39);
	}

	/**
	 * Setter for <code>mysql.user.authentication_string</code>.
	 */
	public void setAuthenticationString(String value) {
		setValue(40, value);
	}

	/**
	 * Getter for <code>mysql.user.authentication_string</code>.
	 */
	public String getAuthenticationString() {
		return (String) getValue(40);
	}

	/**
	 * Setter for <code>mysql.user.password_expired</code>.
	 */
	public void setPasswordExpired(UserPasswordExpired value) {
		setValue(41, value);
	}

	/**
	 * Getter for <code>mysql.user.password_expired</code>.
	 */
	public UserPasswordExpired getPasswordExpired() {
		return (UserPasswordExpired) getValue(41);
	}

	/**
	 * Setter for <code>mysql.user.password_last_changed</code>.
	 */
	public void setPasswordLastChanged(Timestamp value) {
		setValue(42, value);
	}

	/**
	 * Getter for <code>mysql.user.password_last_changed</code>.
	 */
	public Timestamp getPasswordLastChanged() {
		return (Timestamp) getValue(42);
	}

	/**
	 * Setter for <code>mysql.user.password_lifetime</code>.
	 */
	public void setPasswordLifetime(UShort value) {
		setValue(43, value);
	}

	/**
	 * Getter for <code>mysql.user.password_lifetime</code>.
	 */
	public UShort getPasswordLifetime() {
		return (UShort) getValue(43);
	}

	/**
	 * Setter for <code>mysql.user.account_locked</code>.
	 */
	public void setAccountLocked(UserAccountLocked value) {
		setValue(44, value);
	}

	/**
	 * Getter for <code>mysql.user.account_locked</code>.
	 */
	public UserAccountLocked getAccountLocked() {
		return (UserAccountLocked) getValue(44);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<String, String> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserRecord
	 */
	public UserRecord() {
		super(User.USER);
	}

	/**
	 * Create a detached, initialised UserRecord
	 */
	public UserRecord(String host, String user, UserSelectPriv selectPriv, UserInsertPriv insertPriv, UserUpdatePriv updatePriv, UserDeletePriv deletePriv, UserCreatePriv createPriv, UserDropPriv dropPriv, UserReloadPriv reloadPriv, UserShutdownPriv shutdownPriv, UserProcessPriv processPriv, UserFilePriv filePriv, UserGrantPriv grantPriv, UserReferencesPriv referencesPriv, UserIndexPriv indexPriv, UserAlterPriv alterPriv, UserShowDbPriv showDbPriv, UserSuperPriv superPriv, UserCreateTmpTablePriv createTmpTablePriv, UserLockTablesPriv lockTablesPriv, UserExecutePriv executePriv, UserReplSlavePriv replSlavePriv, UserReplClientPriv replClientPriv, UserCreateViewPriv createViewPriv, UserShowViewPriv showViewPriv, UserCreateRoutinePriv createRoutinePriv, UserAlterRoutinePriv alterRoutinePriv, UserCreateUserPriv createUserPriv, UserEventPriv eventPriv, UserTriggerPriv triggerPriv, UserCreateTablespacePriv createTablespacePriv, UserSslType sslType, byte[] sslCipher, byte[] x509Issuer, byte[] x509Subject, UInteger maxQuestions, UInteger maxUpdates, UInteger maxConnections, UInteger maxUserConnections, String plugin, String authenticationString, UserPasswordExpired passwordExpired, Timestamp passwordLastChanged, UShort passwordLifetime, UserAccountLocked accountLocked) {
		super(User.USER);

		setValue(0, host);
		setValue(1, user);
		setValue(2, selectPriv);
		setValue(3, insertPriv);
		setValue(4, updatePriv);
		setValue(5, deletePriv);
		setValue(6, createPriv);
		setValue(7, dropPriv);
		setValue(8, reloadPriv);
		setValue(9, shutdownPriv);
		setValue(10, processPriv);
		setValue(11, filePriv);
		setValue(12, grantPriv);
		setValue(13, referencesPriv);
		setValue(14, indexPriv);
		setValue(15, alterPriv);
		setValue(16, showDbPriv);
		setValue(17, superPriv);
		setValue(18, createTmpTablePriv);
		setValue(19, lockTablesPriv);
		setValue(20, executePriv);
		setValue(21, replSlavePriv);
		setValue(22, replClientPriv);
		setValue(23, createViewPriv);
		setValue(24, showViewPriv);
		setValue(25, createRoutinePriv);
		setValue(26, alterRoutinePriv);
		setValue(27, createUserPriv);
		setValue(28, eventPriv);
		setValue(29, triggerPriv);
		setValue(30, createTablespacePriv);
		setValue(31, sslType);
		setValue(32, sslCipher);
		setValue(33, x509Issuer);
		setValue(34, x509Subject);
		setValue(35, maxQuestions);
		setValue(36, maxUpdates);
		setValue(37, maxConnections);
		setValue(38, maxUserConnections);
		setValue(39, plugin);
		setValue(40, authenticationString);
		setValue(41, passwordExpired);
		setValue(42, passwordLastChanged);
		setValue(43, passwordLifetime);
		setValue(44, accountLocked);
	}
}
