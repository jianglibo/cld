/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.tables;


import com.mymock.db.performance_schema.PerformanceSchema;
import com.mymock.db.performance_schema.enums.SocketInstancesState;
import com.mymock.db.performance_schema.tables.records.SocketInstancesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
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
public class SocketInstances extends TableImpl<SocketInstancesRecord> {

	private static final long serialVersionUID = 853817820;

	/**
	 * The reference instance of <code>performance_schema.socket_instances</code>
	 */
	public static final SocketInstances SOCKET_INSTANCES = new SocketInstances();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SocketInstancesRecord> getRecordType() {
		return SocketInstancesRecord.class;
	}

	/**
	 * The column <code>performance_schema.socket_instances.EVENT_NAME</code>.
	 */
	public final TableField<SocketInstancesRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.socket_instances.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public final TableField<SocketInstancesRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.socket_instances.THREAD_ID</code>.
	 */
	public final TableField<SocketInstancesRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.socket_instances.SOCKET_ID</code>.
	 */
	public final TableField<SocketInstancesRecord, Integer> SOCKET_ID = createField("SOCKET_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.socket_instances.IP</code>.
	 */
	public final TableField<SocketInstancesRecord, String> IP = createField("IP", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.socket_instances.PORT</code>.
	 */
	public final TableField<SocketInstancesRecord, Integer> PORT = createField("PORT", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.socket_instances.STATE</code>.
	 */
	public final TableField<SocketInstancesRecord, SocketInstancesState> STATE = createField("STATE", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.mymock.db.performance_schema.enums.SocketInstancesState.class), this, "");

	/**
	 * Create a <code>performance_schema.socket_instances</code> table reference
	 */
	public SocketInstances() {
		this("socket_instances", null);
	}

	/**
	 * Create an aliased <code>performance_schema.socket_instances</code> table reference
	 */
	public SocketInstances(String alias) {
		this(alias, SOCKET_INSTANCES);
	}

	private SocketInstances(String alias, Table<SocketInstancesRecord> aliased) {
		this(alias, aliased, null);
	}

	private SocketInstances(String alias, Table<SocketInstancesRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SocketInstances as(String alias) {
		return new SocketInstances(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SocketInstances rename(String name) {
		return new SocketInstances(name, null);
	}
}
