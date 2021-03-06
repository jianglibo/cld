/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.tables.records;


import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.example.gradle.db.sys.tables.X$hostSummaryByStatementLatency;
import org.jooq.impl.TableRecordImpl;


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
public class X$hostSummaryByStatementLatencyRecord extends TableRecordImpl<X$hostSummaryByStatementLatencyRecord> implements Record9<String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> {

	private static final long serialVersionUID = 1643907480;

	/**
	 * Setter for <code>sys.x$host_summary_by_statement_latency.host</code>.
	 */
	public void setHost(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary_by_statement_latency.host</code>.
	 */
	public String getHost() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.x$host_summary_by_statement_latency.total</code>.
	 */
	public void setTotal(BigInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary_by_statement_latency.total</code>.
	 */
	public BigInteger getTotal() {
		return (BigInteger) getValue(1);
	}

	/**
	 * Setter for <code>sys.x$host_summary_by_statement_latency.total_latency</code>.
	 */
	public void setTotalLatency(BigInteger value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary_by_statement_latency.total_latency</code>.
	 */
	public BigInteger getTotalLatency() {
		return (BigInteger) getValue(2);
	}

	/**
	 * Setter for <code>sys.x$host_summary_by_statement_latency.max_latency</code>.
	 */
	public void setMaxLatency(BigInteger value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary_by_statement_latency.max_latency</code>.
	 */
	public BigInteger getMaxLatency() {
		return (BigInteger) getValue(3);
	}

	/**
	 * Setter for <code>sys.x$host_summary_by_statement_latency.lock_latency</code>.
	 */
	public void setLockLatency(BigInteger value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary_by_statement_latency.lock_latency</code>.
	 */
	public BigInteger getLockLatency() {
		return (BigInteger) getValue(4);
	}

	/**
	 * Setter for <code>sys.x$host_summary_by_statement_latency.rows_sent</code>.
	 */
	public void setRowsSent(BigInteger value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary_by_statement_latency.rows_sent</code>.
	 */
	public BigInteger getRowsSent() {
		return (BigInteger) getValue(5);
	}

	/**
	 * Setter for <code>sys.x$host_summary_by_statement_latency.rows_examined</code>.
	 */
	public void setRowsExamined(BigInteger value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary_by_statement_latency.rows_examined</code>.
	 */
	public BigInteger getRowsExamined() {
		return (BigInteger) getValue(6);
	}

	/**
	 * Setter for <code>sys.x$host_summary_by_statement_latency.rows_affected</code>.
	 */
	public void setRowsAffected(BigInteger value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary_by_statement_latency.rows_affected</code>.
	 */
	public BigInteger getRowsAffected() {
		return (BigInteger) getValue(7);
	}

	/**
	 * Setter for <code>sys.x$host_summary_by_statement_latency.full_scans</code>.
	 */
	public void setFullScans(BigInteger value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sys.x$host_summary_by_statement_latency.full_scans</code>.
	 */
	public BigInteger getFullScans() {
		return (BigInteger) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY.HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field2() {
		return X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY.TOTAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field3() {
		return X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY.TOTAL_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field4() {
		return X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY.MAX_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field5() {
		return X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY.LOCK_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field6() {
		return X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY.ROWS_SENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field7() {
		return X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY.ROWS_EXAMINED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field8() {
		return X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY.ROWS_AFFECTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field9() {
		return X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY.FULL_SCANS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getHost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value2() {
		return getTotal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value3() {
		return getTotalLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value4() {
		return getMaxLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value5() {
		return getLockLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value6() {
		return getRowsSent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value7() {
		return getRowsExamined();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value8() {
		return getRowsAffected();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value9() {
		return getFullScans();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryByStatementLatencyRecord value1(String value) {
		setHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryByStatementLatencyRecord value2(BigInteger value) {
		setTotal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryByStatementLatencyRecord value3(BigInteger value) {
		setTotalLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryByStatementLatencyRecord value4(BigInteger value) {
		setMaxLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryByStatementLatencyRecord value5(BigInteger value) {
		setLockLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryByStatementLatencyRecord value6(BigInteger value) {
		setRowsSent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryByStatementLatencyRecord value7(BigInteger value) {
		setRowsExamined(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryByStatementLatencyRecord value8(BigInteger value) {
		setRowsAffected(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryByStatementLatencyRecord value9(BigInteger value) {
		setFullScans(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryByStatementLatencyRecord values(String value1, BigInteger value2, BigInteger value3, BigInteger value4, BigInteger value5, BigInteger value6, BigInteger value7, BigInteger value8, BigInteger value9) {
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
	 * Create a detached X$hostSummaryByStatementLatencyRecord
	 */
	public X$hostSummaryByStatementLatencyRecord() {
		super(X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY);
	}

	/**
	 * Create a detached, initialised X$hostSummaryByStatementLatencyRecord
	 */
	public X$hostSummaryByStatementLatencyRecord(String host, BigInteger total, BigInteger totalLatency, BigInteger maxLatency, BigInteger lockLatency, BigInteger rowsSent, BigInteger rowsExamined, BigInteger rowsAffected, BigInteger fullScans) {
		super(X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY);

		setValue(0, host);
		setValue(1, total);
		setValue(2, totalLatency);
		setValue(3, maxLatency);
		setValue(4, lockLatency);
		setValue(5, rowsSent);
		setValue(6, rowsExamined);
		setValue(7, rowsAffected);
		setValue(8, fullScans);
	}
}
