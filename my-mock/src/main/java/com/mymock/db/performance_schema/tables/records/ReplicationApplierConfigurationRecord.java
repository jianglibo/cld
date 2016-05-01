/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.tables.records;


import com.mymock.db.performance_schema.tables.ReplicationApplierConfiguration;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class ReplicationApplierConfigurationRecord extends TableRecordImpl<ReplicationApplierConfigurationRecord> implements Record2<String, Integer> {

	private static final long serialVersionUID = 1553160548;

	/**
	 * Setter for <code>performance_schema.replication_applier_configuration.CHANNEL_NAME</code>.
	 */
	public void setChannelName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_applier_configuration.CHANNEL_NAME</code>.
	 */
	public String getChannelName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.replication_applier_configuration.DESIRED_DELAY</code>.
	 */
	public void setDesiredDelay(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.replication_applier_configuration.DESIRED_DELAY</code>.
	 */
	public Integer getDesiredDelay() {
		return (Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, Integer> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, Integer> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION.CHANNEL_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION.DESIRED_DELAY;
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
	public Integer value2() {
		return getDesiredDelay();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationApplierConfigurationRecord value1(String value) {
		setChannelName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationApplierConfigurationRecord value2(Integer value) {
		setDesiredDelay(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationApplierConfigurationRecord values(String value1, Integer value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ReplicationApplierConfigurationRecord
	 */
	public ReplicationApplierConfigurationRecord() {
		super(ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION);
	}

	/**
	 * Create a detached, initialised ReplicationApplierConfigurationRecord
	 */
	public ReplicationApplierConfigurationRecord(String channelName, Integer desiredDelay) {
		super(ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION);

		setValue(0, channelName);
		setValue(1, desiredDelay);
	}
}
