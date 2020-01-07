/*
 * BrainRex API
 * The Brainrex API is a collection of analytics tools and data integrations made for blockchain developers. In particular we offer Natural Language Processing and Anomaly detection algorithms that have been fine tune to understand text data and time series in the domain speficic setting of cryptocurrency and blockchain technology. This technology is intended to be use as building blocks to bigger applications, we offer examples on how to use them for Trading Backtesting and Smart Contract anomaly monitoring.
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * OrderbookResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-07T13:51:54.821Z")
public class OrderbookResponse {
  @SerializedName("base_trading_symbol")
  private String baseTradingSymbol = null;

  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("limit")
  private BigDecimal limit = null;

  @SerializedName("quote_trading_symbol")
  private String quoteTradingSymbol = null;

  public OrderbookResponse baseTradingSymbol(String baseTradingSymbol) {
    this.baseTradingSymbol = baseTradingSymbol;
    return this;
  }

   /**
   * Name of the currency pair
   * @return baseTradingSymbol
  **/
  @ApiModelProperty(example = "BTC", value = "Name of the currency pair")
  public String getBaseTradingSymbol() {
    return baseTradingSymbol;
  }

  public void setBaseTradingSymbol(String baseTradingSymbol) {
    this.baseTradingSymbol = baseTradingSymbol;
  }

  public OrderbookResponse exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Name of the exchange
   * @return exchange
  **/
  @ApiModelProperty(example = "coinbasepro", value = "Name of the exchange")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public OrderbookResponse limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Limit depth to extract from the orderbook
   * @return limit
  **/
  @ApiModelProperty(example = "2.0", value = "Limit depth to extract from the orderbook")
  public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  public OrderbookResponse quoteTradingSymbol(String quoteTradingSymbol) {
    this.quoteTradingSymbol = quoteTradingSymbol;
    return this;
  }

   /**
   * Name of the data format availables (standard)
   * @return quoteTradingSymbol
  **/
  @ApiModelProperty(example = "USD", value = "Name of the data format availables (standard)")
  public String getQuoteTradingSymbol() {
    return quoteTradingSymbol;
  }

  public void setQuoteTradingSymbol(String quoteTradingSymbol) {
    this.quoteTradingSymbol = quoteTradingSymbol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderbookResponse orderbookResponse = (OrderbookResponse) o;
    return Objects.equals(this.baseTradingSymbol, orderbookResponse.baseTradingSymbol) &&
        Objects.equals(this.exchange, orderbookResponse.exchange) &&
        Objects.equals(this.limit, orderbookResponse.limit) &&
        Objects.equals(this.quoteTradingSymbol, orderbookResponse.quoteTradingSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseTradingSymbol, exchange, limit, quoteTradingSymbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderbookResponse {\n");
    
    sb.append("    baseTradingSymbol: ").append(toIndentedString(baseTradingSymbol)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    quoteTradingSymbol: ").append(toIndentedString(quoteTradingSymbol)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

