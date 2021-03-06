/**
 * This class is generated by jOOQ
 */
package com.mymock.webproxy.db.public_.tables.records;


import com.mymock.webproxy.db.public_.tables.Wpheader;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class WpheaderRecord extends UpdatableRecordImpl<WpheaderRecord> implements Record4<Integer, Integer, String, String> {

	private static final long serialVersionUID = 1019338749;

	/**
	 * Setter for <code>PUBLIC.WPHEADER.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.WPHEADER.ID</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.WPHEADER.URL_ID</code>.
	 */
	public void setUrlId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.WPHEADER.URL_ID</code>.
	 */
	public Integer getUrlId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.WPHEADER.HEADER_NAME</code>.
	 */
	public void setHeaderName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.WPHEADER.HEADER_NAME</code>.
	 */
	public String getHeaderName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.WPHEADER.HEADER_VALUE</code>.
	 */
	public void setHeaderValue(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.WPHEADER.HEADER_VALUE</code>.
	 */
	public String getHeaderValue() {
		return (String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, Integer, String, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, Integer, String, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Wpheader.WPHEADER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Wpheader.WPHEADER.URL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Wpheader.WPHEADER.HEADER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Wpheader.WPHEADER.HEADER_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getUrlId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getHeaderName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getHeaderValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WpheaderRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WpheaderRecord value2(Integer value) {
		setUrlId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WpheaderRecord value3(String value) {
		setHeaderName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WpheaderRecord value4(String value) {
		setHeaderValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WpheaderRecord values(Integer value1, Integer value2, String value3, String value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WpheaderRecord
	 */
	public WpheaderRecord() {
		super(Wpheader.WPHEADER);
	}

	/**
	 * Create a detached, initialised WpheaderRecord
	 */
	public WpheaderRecord(Integer id, Integer urlId, String headerName, String headerValue) {
		super(Wpheader.WPHEADER);

		setValue(0, id);
		setValue(1, urlId);
		setValue(2, headerName);
		setValue(3, headerValue);
	}
}
