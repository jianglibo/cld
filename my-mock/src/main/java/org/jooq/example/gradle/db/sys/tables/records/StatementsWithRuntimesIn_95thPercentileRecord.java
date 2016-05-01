/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.tables.records;


import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.example.gradle.db.sys.tables.StatementsWithRuntimesIn_95thPercentile;
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
public class StatementsWithRuntimesIn_95thPercentileRecord extends TableRecordImpl<StatementsWithRuntimesIn_95thPercentileRecord> implements Record16<String, String, String, ULong, ULong, ULong, String, String, String, ULong, BigInteger, ULong, BigInteger, Timestamp, Timestamp, String> {

	private static final long serialVersionUID = -878875892;

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.query</code>.
	 */
	public void setQuery(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.query</code>.
	 */
	public String getQuery() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.db</code>.
	 */
	public void setDb(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.db</code>.
	 */
	public String getDb() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.full_scan</code>.
	 */
	public void setFullScan(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.full_scan</code>.
	 */
	public String getFullScan() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.exec_count</code>.
	 */
	public void setExecCount(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.exec_count</code>.
	 */
	public ULong getExecCount() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.err_count</code>.
	 */
	public void setErrCount(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.err_count</code>.
	 */
	public ULong getErrCount() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.warn_count</code>.
	 */
	public void setWarnCount(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.warn_count</code>.
	 */
	public ULong getWarnCount() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.total_latency</code>.
	 */
	public void setTotalLatency(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.total_latency</code>.
	 */
	public String getTotalLatency() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.max_latency</code>.
	 */
	public void setMaxLatency(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.max_latency</code>.
	 */
	public String getMaxLatency() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.avg_latency</code>.
	 */
	public void setAvgLatency(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.avg_latency</code>.
	 */
	public String getAvgLatency() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.rows_sent</code>.
	 */
	public void setRowsSent(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.rows_sent</code>.
	 */
	public ULong getRowsSent() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.rows_sent_avg</code>.
	 */
	public void setRowsSentAvg(BigInteger value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.rows_sent_avg</code>.
	 */
	public BigInteger getRowsSentAvg() {
		return (BigInteger) getValue(10);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.rows_examined</code>.
	 */
	public void setRowsExamined(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.rows_examined</code>.
	 */
	public ULong getRowsExamined() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.rows_examined_avg</code>.
	 */
	public void setRowsExaminedAvg(BigInteger value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.rows_examined_avg</code>.
	 */
	public BigInteger getRowsExaminedAvg() {
		return (BigInteger) getValue(12);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.first_seen</code>.
	 */
	public void setFirstSeen(Timestamp value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.first_seen</code>.
	 */
	public Timestamp getFirstSeen() {
		return (Timestamp) getValue(13);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.last_seen</code>.
	 */
	public void setLastSeen(Timestamp value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.last_seen</code>.
	 */
	public Timestamp getLastSeen() {
		return (Timestamp) getValue(14);
	}

	/**
	 * Setter for <code>sys.statements_with_runtimes_in_95th_percentile.digest</code>.
	 */
	public void setDigest(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>sys.statements_with_runtimes_in_95th_percentile.digest</code>.
	 */
	public String getDigest() {
		return (String) getValue(15);
	}

	// -------------------------------------------------------------------------
	// Record16 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<String, String, String, ULong, ULong, ULong, String, String, String, ULong, BigInteger, ULong, BigInteger, Timestamp, Timestamp, String> fieldsRow() {
		return (Row16) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<String, String, String, ULong, ULong, ULong, String, String, String, ULong, BigInteger, ULong, BigInteger, Timestamp, Timestamp, String> valuesRow() {
		return (Row16) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.QUERY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.DB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.FULL_SCAN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field4() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.EXEC_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field5() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.ERR_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field6() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.WARN_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.TOTAL_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.MAX_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.AVG_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field10() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.ROWS_SENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field11() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.ROWS_SENT_AVG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field12() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.ROWS_EXAMINED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field13() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.ROWS_EXAMINED_AVG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field14() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.FIRST_SEEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field15() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.LAST_SEEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field16() {
		return StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.DIGEST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getQuery();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getDb();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getFullScan();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value4() {
		return getExecCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value5() {
		return getErrCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value6() {
		return getWarnCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getTotalLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getMaxLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getAvgLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value10() {
		return getRowsSent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value11() {
		return getRowsSentAvg();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value12() {
		return getRowsExamined();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value13() {
		return getRowsExaminedAvg();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value14() {
		return getFirstSeen();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value15() {
		return getLastSeen();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value16() {
		return getDigest();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value1(String value) {
		setQuery(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value2(String value) {
		setDb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value3(String value) {
		setFullScan(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value4(ULong value) {
		setExecCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value5(ULong value) {
		setErrCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value6(ULong value) {
		setWarnCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value7(String value) {
		setTotalLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value8(String value) {
		setMaxLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value9(String value) {
		setAvgLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value10(ULong value) {
		setRowsSent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value11(BigInteger value) {
		setRowsSentAvg(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value12(ULong value) {
		setRowsExamined(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value13(BigInteger value) {
		setRowsExaminedAvg(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value14(Timestamp value) {
		setFirstSeen(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value15(Timestamp value) {
		setLastSeen(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord value16(String value) {
		setDigest(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithRuntimesIn_95thPercentileRecord values(String value1, String value2, String value3, ULong value4, ULong value5, ULong value6, String value7, String value8, String value9, ULong value10, BigInteger value11, ULong value12, BigInteger value13, Timestamp value14, Timestamp value15, String value16) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		value15(value15);
		value16(value16);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StatementsWithRuntimesIn_95thPercentileRecord
	 */
	public StatementsWithRuntimesIn_95thPercentileRecord() {
		super(StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE);
	}

	/**
	 * Create a detached, initialised StatementsWithRuntimesIn_95thPercentileRecord
	 */
	public StatementsWithRuntimesIn_95thPercentileRecord(String query, String db, String fullScan, ULong execCount, ULong errCount, ULong warnCount, String totalLatency, String maxLatency, String avgLatency, ULong rowsSent, BigInteger rowsSentAvg, ULong rowsExamined, BigInteger rowsExaminedAvg, Timestamp firstSeen, Timestamp lastSeen, String digest) {
		super(StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE);

		setValue(0, query);
		setValue(1, db);
		setValue(2, fullScan);
		setValue(3, execCount);
		setValue(4, errCount);
		setValue(5, warnCount);
		setValue(6, totalLatency);
		setValue(7, maxLatency);
		setValue(8, avgLatency);
		setValue(9, rowsSent);
		setValue(10, rowsSentAvg);
		setValue(11, rowsExamined);
		setValue(12, rowsExaminedAvg);
		setValue(13, firstSeen);
		setValue(14, lastSeen);
		setValue(15, digest);
	}
}
