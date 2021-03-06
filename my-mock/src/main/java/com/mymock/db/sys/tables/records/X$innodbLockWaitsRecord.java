/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables.records;


import com.mymock.db.sys.tables.X$innodbLockWaits;

import java.sql.Time;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$innodbLockWaitsRecord extends TableRecordImpl<X$innodbLockWaitsRecord> {

	private static final long serialVersionUID = -854572075;

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.wait_started</code>.
	 */
	public void setWaitStarted(Timestamp value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.wait_started</code>.
	 */
	public Timestamp getWaitStarted() {
		return (Timestamp) getValue(0);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.wait_age</code>.
	 */
	public void setWaitAge(Time value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.wait_age</code>.
	 */
	public Time getWaitAge() {
		return (Time) getValue(1);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.wait_age_secs</code>.
	 */
	public void setWaitAgeSecs(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.wait_age_secs</code>.
	 */
	public Long getWaitAgeSecs() {
		return (Long) getValue(2);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.locked_table</code>.
	 */
	public void setLockedTable(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.locked_table</code>.
	 */
	public String getLockedTable() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.locked_index</code>.
	 */
	public void setLockedIndex(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.locked_index</code>.
	 */
	public String getLockedIndex() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.locked_type</code>.
	 */
	public void setLockedType(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.locked_type</code>.
	 */
	public String getLockedType() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.waiting_trx_id</code>.
	 */
	public void setWaitingTrxId(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.waiting_trx_id</code>.
	 */
	public String getWaitingTrxId() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.waiting_trx_started</code>.
	 */
	public void setWaitingTrxStarted(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.waiting_trx_started</code>.
	 */
	public Timestamp getWaitingTrxStarted() {
		return (Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.waiting_trx_age</code>.
	 */
	public void setWaitingTrxAge(Time value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.waiting_trx_age</code>.
	 */
	public Time getWaitingTrxAge() {
		return (Time) getValue(8);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.waiting_trx_rows_locked</code>.
	 */
	public void setWaitingTrxRowsLocked(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.waiting_trx_rows_locked</code>.
	 */
	public ULong getWaitingTrxRowsLocked() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.waiting_trx_rows_modified</code>.
	 */
	public void setWaitingTrxRowsModified(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.waiting_trx_rows_modified</code>.
	 */
	public ULong getWaitingTrxRowsModified() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.waiting_pid</code>.
	 */
	public void setWaitingPid(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.waiting_pid</code>.
	 */
	public ULong getWaitingPid() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.waiting_query</code>.
	 */
	public void setWaitingQuery(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.waiting_query</code>.
	 */
	public String getWaitingQuery() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.waiting_lock_id</code>.
	 */
	public void setWaitingLockId(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.waiting_lock_id</code>.
	 */
	public String getWaitingLockId() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.waiting_lock_mode</code>.
	 */
	public void setWaitingLockMode(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.waiting_lock_mode</code>.
	 */
	public String getWaitingLockMode() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.blocking_trx_id</code>.
	 */
	public void setBlockingTrxId(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.blocking_trx_id</code>.
	 */
	public String getBlockingTrxId() {
		return (String) getValue(15);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.blocking_pid</code>.
	 */
	public void setBlockingPid(ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.blocking_pid</code>.
	 */
	public ULong getBlockingPid() {
		return (ULong) getValue(16);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.blocking_query</code>.
	 */
	public void setBlockingQuery(String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.blocking_query</code>.
	 */
	public String getBlockingQuery() {
		return (String) getValue(17);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.blocking_lock_id</code>.
	 */
	public void setBlockingLockId(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.blocking_lock_id</code>.
	 */
	public String getBlockingLockId() {
		return (String) getValue(18);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.blocking_lock_mode</code>.
	 */
	public void setBlockingLockMode(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.blocking_lock_mode</code>.
	 */
	public String getBlockingLockMode() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.blocking_trx_started</code>.
	 */
	public void setBlockingTrxStarted(Timestamp value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.blocking_trx_started</code>.
	 */
	public Timestamp getBlockingTrxStarted() {
		return (Timestamp) getValue(20);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.blocking_trx_age</code>.
	 */
	public void setBlockingTrxAge(Time value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.blocking_trx_age</code>.
	 */
	public Time getBlockingTrxAge() {
		return (Time) getValue(21);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.blocking_trx_rows_locked</code>.
	 */
	public void setBlockingTrxRowsLocked(ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.blocking_trx_rows_locked</code>.
	 */
	public ULong getBlockingTrxRowsLocked() {
		return (ULong) getValue(22);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.blocking_trx_rows_modified</code>.
	 */
	public void setBlockingTrxRowsModified(ULong value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.blocking_trx_rows_modified</code>.
	 */
	public ULong getBlockingTrxRowsModified() {
		return (ULong) getValue(23);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.sql_kill_blocking_query</code>.
	 */
	public void setSqlKillBlockingQuery(String value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.sql_kill_blocking_query</code>.
	 */
	public String getSqlKillBlockingQuery() {
		return (String) getValue(24);
	}

	/**
	 * Setter for <code>sys.x$innodb_lock_waits.sql_kill_blocking_connection</code>.
	 */
	public void setSqlKillBlockingConnection(String value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>sys.x$innodb_lock_waits.sql_kill_blocking_connection</code>.
	 */
	public String getSqlKillBlockingConnection() {
		return (String) getValue(25);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached X$innodbLockWaitsRecord
	 */
	public X$innodbLockWaitsRecord() {
		super(X$innodbLockWaits.X$INNODB_LOCK_WAITS);
	}

	/**
	 * Create a detached, initialised X$innodbLockWaitsRecord
	 */
	public X$innodbLockWaitsRecord(Timestamp waitStarted, Time waitAge, Long waitAgeSecs, String lockedTable, String lockedIndex, String lockedType, String waitingTrxId, Timestamp waitingTrxStarted, Time waitingTrxAge, ULong waitingTrxRowsLocked, ULong waitingTrxRowsModified, ULong waitingPid, String waitingQuery, String waitingLockId, String waitingLockMode, String blockingTrxId, ULong blockingPid, String blockingQuery, String blockingLockId, String blockingLockMode, Timestamp blockingTrxStarted, Time blockingTrxAge, ULong blockingTrxRowsLocked, ULong blockingTrxRowsModified, String sqlKillBlockingQuery, String sqlKillBlockingConnection) {
		super(X$innodbLockWaits.X$INNODB_LOCK_WAITS);

		setValue(0, waitStarted);
		setValue(1, waitAge);
		setValue(2, waitAgeSecs);
		setValue(3, lockedTable);
		setValue(4, lockedIndex);
		setValue(5, lockedType);
		setValue(6, waitingTrxId);
		setValue(7, waitingTrxStarted);
		setValue(8, waitingTrxAge);
		setValue(9, waitingTrxRowsLocked);
		setValue(10, waitingTrxRowsModified);
		setValue(11, waitingPid);
		setValue(12, waitingQuery);
		setValue(13, waitingLockId);
		setValue(14, waitingLockMode);
		setValue(15, blockingTrxId);
		setValue(16, blockingPid);
		setValue(17, blockingQuery);
		setValue(18, blockingLockId);
		setValue(19, blockingLockMode);
		setValue(20, blockingTrxStarted);
		setValue(21, blockingTrxAge);
		setValue(22, blockingTrxRowsLocked);
		setValue(23, blockingTrxRowsModified);
		setValue(24, sqlKillBlockingQuery);
		setValue(25, sqlKillBlockingConnection);
	}
}
