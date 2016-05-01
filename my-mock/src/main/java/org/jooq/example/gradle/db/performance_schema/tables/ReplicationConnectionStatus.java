/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.performance_schema.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.performance_schema.PerformanceSchema;
import org.jooq.example.gradle.db.performance_schema.enums.ReplicationConnectionStatusServiceState;
import org.jooq.example.gradle.db.performance_schema.tables.records.ReplicationConnectionStatusRecord;
import org.jooq.impl.TableImpl;
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
public class ReplicationConnectionStatus extends TableImpl<ReplicationConnectionStatusRecord> {

	private static final long serialVersionUID = -1056484965;

	/**
	 * The reference instance of <code>performance_schema.replication_connection_status</code>
	 */
	public static final ReplicationConnectionStatus REPLICATION_CONNECTION_STATUS = new ReplicationConnectionStatus();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ReplicationConnectionStatusRecord> getRecordType() {
		return ReplicationConnectionStatusRecord.class;
	}

	/**
	 * The column <code>performance_schema.replication_connection_status.CHANNEL_NAME</code>.
	 */
	public final TableField<ReplicationConnectionStatusRecord, String> CHANNEL_NAME = createField("CHANNEL_NAME", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.replication_connection_status.GROUP_NAME</code>.
	 */
	public final TableField<ReplicationConnectionStatusRecord, String> GROUP_NAME = createField("GROUP_NAME", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.replication_connection_status.SOURCE_UUID</code>.
	 */
	public final TableField<ReplicationConnectionStatusRecord, String> SOURCE_UUID = createField("SOURCE_UUID", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.replication_connection_status.THREAD_ID</code>.
	 */
	public final TableField<ReplicationConnectionStatusRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.replication_connection_status.SERVICE_STATE</code>.
	 */
	public final TableField<ReplicationConnectionStatusRecord, ReplicationConnectionStatusServiceState> SERVICE_STATE = createField("SERVICE_STATE", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.example.gradle.db.performance_schema.enums.ReplicationConnectionStatusServiceState.class), this, "");

	/**
	 * The column <code>performance_schema.replication_connection_status.COUNT_RECEIVED_HEARTBEATS</code>.
	 */
	public final TableField<ReplicationConnectionStatusRecord, ULong> COUNT_RECEIVED_HEARTBEATS = createField("COUNT_RECEIVED_HEARTBEATS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>performance_schema.replication_connection_status.LAST_HEARTBEAT_TIMESTAMP</code>. Shows when the most recent heartbeat signal was received.
	 */
	public final TableField<ReplicationConnectionStatusRecord, Timestamp> LAST_HEARTBEAT_TIMESTAMP = createField("LAST_HEARTBEAT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "Shows when the most recent heartbeat signal was received.");

	/**
	 * The column <code>performance_schema.replication_connection_status.RECEIVED_TRANSACTION_SET</code>.
	 */
	public final TableField<ReplicationConnectionStatusRecord, String> RECEIVED_TRANSACTION_SET = createField("RECEIVED_TRANSACTION_SET", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.replication_connection_status.LAST_ERROR_NUMBER</code>.
	 */
	public final TableField<ReplicationConnectionStatusRecord, Integer> LAST_ERROR_NUMBER = createField("LAST_ERROR_NUMBER", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.replication_connection_status.LAST_ERROR_MESSAGE</code>.
	 */
	public final TableField<ReplicationConnectionStatusRecord, String> LAST_ERROR_MESSAGE = createField("LAST_ERROR_MESSAGE", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.replication_connection_status.LAST_ERROR_TIMESTAMP</code>.
	 */
	public final TableField<ReplicationConnectionStatusRecord, Timestamp> LAST_ERROR_TIMESTAMP = createField("LAST_ERROR_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>performance_schema.replication_connection_status</code> table reference
	 */
	public ReplicationConnectionStatus() {
		this("replication_connection_status", null);
	}

	/**
	 * Create an aliased <code>performance_schema.replication_connection_status</code> table reference
	 */
	public ReplicationConnectionStatus(String alias) {
		this(alias, REPLICATION_CONNECTION_STATUS);
	}

	private ReplicationConnectionStatus(String alias, Table<ReplicationConnectionStatusRecord> aliased) {
		this(alias, aliased, null);
	}

	private ReplicationConnectionStatus(String alias, Table<ReplicationConnectionStatusRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReplicationConnectionStatus as(String alias) {
		return new ReplicationConnectionStatus(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ReplicationConnectionStatus rename(String name) {
		return new ReplicationConnectionStatus(name, null);
	}
}
