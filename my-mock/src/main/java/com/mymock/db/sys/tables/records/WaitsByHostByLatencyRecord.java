/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables.records;


import com.mymock.db.sys.tables.WaitsByHostByLatency;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class WaitsByHostByLatencyRecord extends TableRecordImpl<WaitsByHostByLatencyRecord> implements Record6<String, String, ULong, String, String, String> {

	private static final long serialVersionUID = 235136034;

	/**
	 * Setter for <code>sys.waits_by_host_by_latency.host</code>.
	 */
	public void setHost(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.waits_by_host_by_latency.host</code>.
	 */
	public String getHost() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.waits_by_host_by_latency.event</code>.
	 */
	public void setEvent(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.waits_by_host_by_latency.event</code>.
	 */
	public String getEvent() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sys.waits_by_host_by_latency.total</code>.
	 */
	public void setTotal(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.waits_by_host_by_latency.total</code>.
	 */
	public ULong getTotal() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>sys.waits_by_host_by_latency.total_latency</code>.
	 */
	public void setTotalLatency(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.waits_by_host_by_latency.total_latency</code>.
	 */
	public String getTotalLatency() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>sys.waits_by_host_by_latency.avg_latency</code>.
	 */
	public void setAvgLatency(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.waits_by_host_by_latency.avg_latency</code>.
	 */
	public String getAvgLatency() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>sys.waits_by_host_by_latency.max_latency</code>.
	 */
	public void setMaxLatency(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.waits_by_host_by_latency.max_latency</code>.
	 */
	public String getMaxLatency() {
		return (String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, ULong, String, String, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, ULong, String, String, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return WaitsByHostByLatency.WAITS_BY_HOST_BY_LATENCY.HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return WaitsByHostByLatency.WAITS_BY_HOST_BY_LATENCY.EVENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field3() {
		return WaitsByHostByLatency.WAITS_BY_HOST_BY_LATENCY.TOTAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return WaitsByHostByLatency.WAITS_BY_HOST_BY_LATENCY.TOTAL_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return WaitsByHostByLatency.WAITS_BY_HOST_BY_LATENCY.AVG_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return WaitsByHostByLatency.WAITS_BY_HOST_BY_LATENCY.MAX_LATENCY;
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
	public String value2() {
		return getEvent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value3() {
		return getTotal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getTotalLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getAvgLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getMaxLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WaitsByHostByLatencyRecord value1(String value) {
		setHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WaitsByHostByLatencyRecord value2(String value) {
		setEvent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WaitsByHostByLatencyRecord value3(ULong value) {
		setTotal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WaitsByHostByLatencyRecord value4(String value) {
		setTotalLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WaitsByHostByLatencyRecord value5(String value) {
		setAvgLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WaitsByHostByLatencyRecord value6(String value) {
		setMaxLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WaitsByHostByLatencyRecord values(String value1, String value2, ULong value3, String value4, String value5, String value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WaitsByHostByLatencyRecord
	 */
	public WaitsByHostByLatencyRecord() {
		super(WaitsByHostByLatency.WAITS_BY_HOST_BY_LATENCY);
	}

	/**
	 * Create a detached, initialised WaitsByHostByLatencyRecord
	 */
	public WaitsByHostByLatencyRecord(String host, String event, ULong total, String totalLatency, String avgLatency, String maxLatency) {
		super(WaitsByHostByLatency.WAITS_BY_HOST_BY_LATENCY);

		setValue(0, host);
		setValue(1, event);
		setValue(2, total);
		setValue(3, totalLatency);
		setValue(4, avgLatency);
		setValue(5, maxLatency);
	}
}
