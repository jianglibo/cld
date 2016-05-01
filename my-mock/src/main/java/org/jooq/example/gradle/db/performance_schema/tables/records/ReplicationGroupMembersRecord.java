/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.performance_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationGroupMembers;
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
public class ReplicationGroupMembersRecord extends TableRecordImpl<ReplicationGroupMembersRecord> implements Record5<String, String, String, Integer, String> {

	private static final long serialVersionUID = -1744575822;

	/**
	 * Setter for <code>performance_schema.replication_group_members.CHANNEL_NAME</code>.
	 */
	public void setChannelName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_group_members.CHANNEL_NAME</code>.
	 */
	public String getChannelName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.replication_group_members.MEMBER_ID</code>.
	 */
	public void setMemberId(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_group_members.MEMBER_ID</code>.
	 */
	public String getMemberId() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.replication_group_members.MEMBER_HOST</code>.
	 */
	public void setMemberHost(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_group_members.MEMBER_HOST</code>.
	 */
	public String getMemberHost() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.replication_group_members.MEMBER_PORT</code>.
	 */
	public void setMemberPort(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_group_members.MEMBER_PORT</code>.
	 */
	public Integer getMemberPort() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.replication_group_members.MEMBER_STATE</code>.
	 */
	public void setMemberState(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_group_members.MEMBER_STATE</code>.
	 */
	public String getMemberState() {
		return (String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, String, String, Integer, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, String, String, Integer, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return ReplicationGroupMembers.REPLICATION_GROUP_MEMBERS.CHANNEL_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return ReplicationGroupMembers.REPLICATION_GROUP_MEMBERS.MEMBER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return ReplicationGroupMembers.REPLICATION_GROUP_MEMBERS.MEMBER_HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return ReplicationGroupMembers.REPLICATION_GROUP_MEMBERS.MEMBER_PORT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return ReplicationGroupMembers.REPLICATION_GROUP_MEMBERS.MEMBER_STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getChannelName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getMemberId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getMemberHost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getMemberPort();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getMemberState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMembersRecord value1(String value) {
		setChannelName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMembersRecord value2(String value) {
		setMemberId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMembersRecord value3(String value) {
		setMemberHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMembersRecord value4(Integer value) {
		setMemberPort(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMembersRecord value5(String value) {
		setMemberState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMembersRecord values(String value1, String value2, String value3, Integer value4, String value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ReplicationGroupMembersRecord
	 */
	public ReplicationGroupMembersRecord() {
		super(ReplicationGroupMembers.REPLICATION_GROUP_MEMBERS);
	}

	/**
	 * Create a detached, initialised ReplicationGroupMembersRecord
	 */
	public ReplicationGroupMembersRecord(String channelName, String memberId, String memberHost, Integer memberPort, String memberState) {
		super(ReplicationGroupMembers.REPLICATION_GROUP_MEMBERS);

		setValue(0, channelName);
		setValue(1, memberId);
		setValue(2, memberHost);
		setValue(3, memberPort);
		setValue(4, memberState);
	}
}
