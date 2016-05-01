/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables.records;


import com.mymock.db.sys.tables.HostSummaryByFileIo;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class HostSummaryByFileIoRecord extends TableRecordImpl<HostSummaryByFileIoRecord> implements Record3<String, BigInteger, String> {

	private static final long serialVersionUID = 182646886;

	/**
	 * Setter for <code>sys.host_summary_by_file_io.host</code>.
	 */
	public void setHost(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.host_summary_by_file_io.host</code>.
	 */
	public String getHost() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.host_summary_by_file_io.ios</code>.
	 */
	public void setIos(BigInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.host_summary_by_file_io.ios</code>.
	 */
	public BigInteger getIos() {
		return (BigInteger) getValue(1);
	}

	/**
	 * Setter for <code>sys.host_summary_by_file_io.io_latency</code>.
	 */
	public void setIoLatency(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.host_summary_by_file_io.io_latency</code>.
	 */
	public String getIoLatency() {
		return (String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<String, BigInteger, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<String, BigInteger, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO.HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field2() {
		return HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO.IOS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO.IO_LATENCY;
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
		return getIos();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getIoLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HostSummaryByFileIoRecord value1(String value) {
		setHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HostSummaryByFileIoRecord value2(BigInteger value) {
		setIos(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HostSummaryByFileIoRecord value3(String value) {
		setIoLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HostSummaryByFileIoRecord values(String value1, BigInteger value2, String value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached HostSummaryByFileIoRecord
	 */
	public HostSummaryByFileIoRecord() {
		super(HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO);
	}

	/**
	 * Create a detached, initialised HostSummaryByFileIoRecord
	 */
	public HostSummaryByFileIoRecord(String host, BigInteger ios, String ioLatency) {
		super(HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO);

		setValue(0, host);
		setValue(1, ios);
		setValue(2, ioLatency);
	}
}
