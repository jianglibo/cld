/**
 * This class is generated by jOOQ
 */
package com.mymock.db.mysql.tables;


import com.mymock.db.mysql.Keys;
import com.mymock.db.mysql.Mysql;
import com.mymock.db.mysql.tables.records.ServerCostRecord;

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
public class ServerCost extends TableImpl<ServerCostRecord> {

	private static final long serialVersionUID = 746384474;

	/**
	 * The reference instance of <code>mysql.server_cost</code>
	 */
	public static final ServerCost SERVER_COST = new ServerCost();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ServerCostRecord> getRecordType() {
		return ServerCostRecord.class;
	}

	/**
	 * The column <code>mysql.server_cost.cost_name</code>.
	 */
	public final TableField<ServerCostRecord, String> COST_NAME = createField("cost_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.server_cost.cost_value</code>.
	 */
	public final TableField<ServerCostRecord, Double> COST_VALUE = createField("cost_value", org.jooq.impl.SQLDataType.FLOAT, this, "");

	/**
	 * The column <code>mysql.server_cost.last_update</code>.
	 */
	public final TableField<ServerCostRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.server_cost.comment</code>.
	 */
	public final TableField<ServerCostRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * Create a <code>mysql.server_cost</code> table reference
	 */
	public ServerCost() {
		this("server_cost", null);
	}

	/**
	 * Create an aliased <code>mysql.server_cost</code> table reference
	 */
	public ServerCost(String alias) {
		this(alias, SERVER_COST);
	}

	private ServerCost(String alias, Table<ServerCostRecord> aliased) {
		this(alias, aliased, null);
	}

	private ServerCost(String alias, Table<ServerCostRecord> aliased, Field<?>[] parameters) {
		super(alias, Mysql.MYSQL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ServerCostRecord> getPrimaryKey() {
		return Keys.KEY_SERVER_COST_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ServerCostRecord>> getKeys() {
		return Arrays.<UniqueKey<ServerCostRecord>>asList(Keys.KEY_SERVER_COST_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ServerCost as(String alias) {
		return new ServerCost(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ServerCost rename(String name) {
		return new ServerCost(name, null);
	}
}
