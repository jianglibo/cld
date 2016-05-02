/**
 * This class is generated by jOOQ
 */
package com.mymock.db.mysql.tables;


import com.mymock.db.mysql.Keys;
import com.mymock.db.mysql.Mysql;
import com.mymock.db.mysql.tables.records.EngineCostRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class EngineCost extends TableImpl<EngineCostRecord> {

	private static final long serialVersionUID = -1686709512;

	/**
	 * The reference instance of <code>mysql.engine_cost</code>
	 */
	public static final EngineCost ENGINE_COST = new EngineCost();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EngineCostRecord> getRecordType() {
		return EngineCostRecord.class;
	}

	/**
	 * The column <code>mysql.engine_cost.engine_name</code>.
	 */
	public final TableField<EngineCostRecord, String> ENGINE_NAME = createField("engine_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.engine_cost.device_type</code>.
	 */
	public final TableField<EngineCostRecord, Integer> DEVICE_TYPE = createField("device_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>mysql.engine_cost.cost_name</code>.
	 */
	public final TableField<EngineCostRecord, String> COST_NAME = createField("cost_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.engine_cost.cost_value</code>.
	 */
	public final TableField<EngineCostRecord, Double> COST_VALUE = createField("cost_value", org.jooq.impl.SQLDataType.FLOAT, this, "");

	/**
	 * The column <code>mysql.engine_cost.last_update</code>.
	 */
	public final TableField<EngineCostRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.engine_cost.comment</code>.
	 */
	public final TableField<EngineCostRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * Create a <code>mysql.engine_cost</code> table reference
	 */
	public EngineCost() {
		this("engine_cost", null);
	}

	/**
	 * Create an aliased <code>mysql.engine_cost</code> table reference
	 */
	public EngineCost(String alias) {
		this(alias, ENGINE_COST);
	}

	private EngineCost(String alias, Table<EngineCostRecord> aliased) {
		this(alias, aliased, null);
	}

	private EngineCost(String alias, Table<EngineCostRecord> aliased, Field<?>[] parameters) {
		super(alias, Mysql.MYSQL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<EngineCostRecord> getPrimaryKey() {
		return Keys.KEY_ENGINE_COST_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<EngineCostRecord>> getKeys() {
		return Arrays.<UniqueKey<EngineCostRecord>>asList(Keys.KEY_ENGINE_COST_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EngineCost as(String alias) {
		return new EngineCost(alias, this);
	}

	/**
	 * Rename this table
	 */
	public EngineCost rename(String name) {
		return new EngineCost(name, null);
	}
}