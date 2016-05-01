/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.mysql.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.example.gradle.db.mysql.tables.TimeZoneTransitionType;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * Time zone transition types
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZoneTransitionTypeRecord extends UpdatableRecordImpl<TimeZoneTransitionTypeRecord> implements Record5<UInteger, UInteger, Integer, UByte, String> {

	private static final long serialVersionUID = 1392300541;

	/**
	 * Setter for <code>mysql.time_zone_transition_type.Time_zone_id</code>.
	 */
	public void setTimeZoneId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.time_zone_transition_type.Time_zone_id</code>.
	 */
	public UInteger getTimeZoneId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>mysql.time_zone_transition_type.Transition_type_id</code>.
	 */
	public void setTransitionTypeId(UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.time_zone_transition_type.Transition_type_id</code>.
	 */
	public UInteger getTransitionTypeId() {
		return (UInteger) getValue(1);
	}

	/**
	 * Setter for <code>mysql.time_zone_transition_type.Offset</code>.
	 */
	public void setOffset(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.time_zone_transition_type.Offset</code>.
	 */
	public Integer getOffset() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>mysql.time_zone_transition_type.Is_DST</code>.
	 */
	public void setIsDst(UByte value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.time_zone_transition_type.Is_DST</code>.
	 */
	public UByte getIsDst() {
		return (UByte) getValue(3);
	}

	/**
	 * Setter for <code>mysql.time_zone_transition_type.Abbreviation</code>.
	 */
	public void setAbbreviation(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mysql.time_zone_transition_type.Abbreviation</code>.
	 */
	public String getAbbreviation() {
		return (String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<UInteger, UInteger> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<UInteger, UInteger, Integer, UByte, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<UInteger, UInteger, Integer, UByte, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
		return TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE.TIME_ZONE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field2() {
		return TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE.TRANSITION_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE.OFFSET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UByte> field4() {
		return TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE.IS_DST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE.ABBREVIATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value1() {
		return getTimeZoneId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value2() {
		return getTransitionTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getOffset();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UByte value4() {
		return getIsDst();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getAbbreviation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TimeZoneTransitionTypeRecord value1(UInteger value) {
		setTimeZoneId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TimeZoneTransitionTypeRecord value2(UInteger value) {
		setTransitionTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TimeZoneTransitionTypeRecord value3(Integer value) {
		setOffset(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TimeZoneTransitionTypeRecord value4(UByte value) {
		setIsDst(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TimeZoneTransitionTypeRecord value5(String value) {
		setAbbreviation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TimeZoneTransitionTypeRecord values(UInteger value1, UInteger value2, Integer value3, UByte value4, String value5) {
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
	 * Create a detached TimeZoneTransitionTypeRecord
	 */
	public TimeZoneTransitionTypeRecord() {
		super(TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE);
	}

	/**
	 * Create a detached, initialised TimeZoneTransitionTypeRecord
	 */
	public TimeZoneTransitionTypeRecord(UInteger timeZoneId, UInteger transitionTypeId, Integer offset, UByte isDst, String abbreviation) {
		super(TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE);

		setValue(0, timeZoneId);
		setValue(1, transitionTypeId);
		setValue(2, offset);
		setValue(3, isDst);
		setValue(4, abbreviation);
	}
}
