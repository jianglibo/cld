/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.tables.records;


import com.mymock.db.performance_schema.tables.ReplicationGroupMemberStats;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class ReplicationGroupMemberStatsRecord extends TableRecordImpl<ReplicationGroupMemberStatsRecord> implements Record9<String, String, String, ULong, ULong, ULong, ULong, String, String> {

	private static final long serialVersionUID = -501765567;

	/**
	 * Setter for <code>performance_schema.replication_group_member_stats.CHANNEL_NAME</code>.
	 */
	public void setChannelName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_group_member_stats.CHANNEL_NAME</code>.
	 */
	public String getChannelName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.replication_group_member_stats.VIEW_ID</code>.
	 */
	public void setViewId(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_group_member_stats.VIEW_ID</code>.
	 */
	public String getViewId() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.replication_group_member_stats.MEMBER_ID</code>.
	 */
	public void setMemberId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_group_member_stats.MEMBER_ID</code>.
	 */
	public String getMemberId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE</code>.
	 */
	public void setCountTransactionsInQueue(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE</code>.
	 */
	public ULong getCountTransactionsInQueue() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED</code>.
	 */
	public void setCountTransactionsChecked(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED</code>.
	 */
	public ULong getCountTransactionsChecked() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.replication_group_member_stats.COUNT_CONFLICTS_DETECTED</code>.
	 */
	public void setCountConflictsDetected(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_group_member_stats.COUNT_CONFLICTS_DETECTED</code>.
	 */
	public ULong getCountConflictsDetected() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_VALIDATING</code>.
	 */
	public void setCountTransactionsValidating(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_VALIDATING</code>.
	 */
	public ULong getCountTransactionsValidating() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS</code>.
	 */
	public void setTransactionsCommittedAllMembers(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS</code>.
	 */
	public String getTransactionsCommittedAllMembers() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION</code>.
	 */
	public void setLastConflictFreeTransaction(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION</code>.
	 */
	public String getLastConflictFreeTransaction() {
		return (String) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, String, String, ULong, ULong, ULong, ULong, String, String> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, String, String, ULong, ULong, ULong, ULong, String, String> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.CHANNEL_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.VIEW_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.MEMBER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field4() {
		return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.COUNT_TRANSACTIONS_IN_QUEUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field5() {
		return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.COUNT_TRANSACTIONS_CHECKED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field6() {
		return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.COUNT_CONFLICTS_DETECTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field7() {
		return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.COUNT_TRANSACTIONS_VALIDATING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.TRANSACTIONS_COMMITTED_ALL_MEMBERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.LAST_CONFLICT_FREE_TRANSACTION;
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
		return getViewId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getMemberId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value4() {
		return getCountTransactionsInQueue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value5() {
		return getCountTransactionsChecked();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value6() {
		return getCountConflictsDetected();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value7() {
		return getCountTransactionsValidating();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getTransactionsCommittedAllMembers();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getLastConflictFreeTransaction();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMemberStatsRecord value1(String value) {
		setChannelName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMemberStatsRecord value2(String value) {
		setViewId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMemberStatsRecord value3(String value) {
		setMemberId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMemberStatsRecord value4(ULong value) {
		setCountTransactionsInQueue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMemberStatsRecord value5(ULong value) {
		setCountTransactionsChecked(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMemberStatsRecord value6(ULong value) {
		setCountConflictsDetected(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMemberStatsRecord value7(ULong value) {
		setCountTransactionsValidating(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMemberStatsRecord value8(String value) {
		setTransactionsCommittedAllMembers(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMemberStatsRecord value9(String value) {
		setLastConflictFreeTransaction(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationGroupMemberStatsRecord values(String value1, String value2, String value3, ULong value4, ULong value5, ULong value6, ULong value7, String value8, String value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ReplicationGroupMemberStatsRecord
	 */
	public ReplicationGroupMemberStatsRecord() {
		super(ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS);
	}

	/**
	 * Create a detached, initialised ReplicationGroupMemberStatsRecord
	 */
	public ReplicationGroupMemberStatsRecord(String channelName, String viewId, String memberId, ULong countTransactionsInQueue, ULong countTransactionsChecked, ULong countConflictsDetected, ULong countTransactionsValidating, String transactionsCommittedAllMembers, String lastConflictFreeTransaction) {
		super(ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS);

		setValue(0, channelName);
		setValue(1, viewId);
		setValue(2, memberId);
		setValue(3, countTransactionsInQueue);
		setValue(4, countTransactionsChecked);
		setValue(5, countConflictsDetected);
		setValue(6, countTransactionsValidating);
		setValue(7, transactionsCommittedAllMembers);
		setValue(8, lastConflictFreeTransaction);
	}
}