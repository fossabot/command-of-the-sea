/*
 * This file is part of Command of the Sea.
 *
 * Copyright (c) 2019 Vincenzo
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package nz.org.vincenzo.cots.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedEnum;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedJson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The domain model object for match.
 *
 * @author Rey Vincent Babilonia
 */
@DynamoDBTable(tableName = "match")
public class Match {

    @Expose
    private String uuid;

    @Expose
    private String whitePlayer;

    @Expose
    private String blackPlayer;

    @Expose
    private String winner;

    @Expose
    private String loser;

    @Expose
    private boolean draw;

    @Expose
    private boolean whitePlayerAgreedToDraw;

    @Expose
    private boolean blackPlayerAgreedToDraw;

    @Expose
    private String host;

    @Expose
    private Date creationDate;

    @Expose
    private Ship.Color turn;

    @Expose
    private boolean started;

    @Expose
    private Date startDate;

    @Expose
    private Date endDate;

    @Expose
    private boolean whitePlayerReady;

    @Expose
    private boolean blackPlayerReady;

    @Expose
    private List<Map<String, Set<Ship>>> turns = new LinkedList<>();

    /**
     * Returns the universally unique identifier.
     *
     * @return the universally unique identifier
     */
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the universally unique identifier.
     *
     * @param uuid the universally unique identifier
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * Returns the UUID of the white {@link Player}.
     *
     * @return the UUID of the white {@link Player}
     */
    @DynamoDBAttribute
    public String getWhitePlayer() {
        return whitePlayer;
    }

    /**
     * Sets the UUID of the white {@link Player}.
     *
     * @param whitePlayer the UUID of the white {@link Player}
     */
    public void setWhitePlayer(String whitePlayer) {
        this.whitePlayer = whitePlayer;
    }

    /**
     * Returns the UUID of the black {@link Player}.
     *
     * @return the UUID of the black {@link Player}
     */
    @DynamoDBAttribute
    public String getBlackPlayer() {
        return blackPlayer;
    }

    /**
     * Sets the UUID of the black {@link Player}.
     *
     * @param blackPlayer the UUID of the black {@link Player}
     */
    public void setBlackPlayer(String blackPlayer) {
        this.blackPlayer = blackPlayer;
    }

    /**
     * Returns the UUID of the winner.
     *
     * @return the UUID of the winner
     */
    @DynamoDBAttribute
    public String getWinner() {
        return winner;
    }

    /**
     * Sets the UUID of the winner.
     *
     * @param winner the UUID of the winner
     */
    public void setWinner(String winner) {
        this.winner = winner;
    }

    /**
     * Returns the UUID of the loser.
     *
     * @return the UUID of the loser
     */
    @DynamoDBAttribute
    public String getLoser() {
        return loser;
    }

    /**
     * Sets the UUID of the loser.
     *
     * @param loser the UUID of the loser
     */
    public void setLoser(String loser) {
        this.loser = loser;
    }

    /**
     * Checks if the match ended in a draw.
     *
     * @return {@code true} if the match ended in a draw; {@code false} otherwise
     */
    @DynamoDBAttribute
    public boolean isDraw() {
        return draw;
    }

    /**
     * Sets the flag if the match ended in a draw.
     *
     * @param draw {@code true} if the match ended in a draw; {@code false} otherwise
     */
    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    /**
     * Checks if the white {@link Player} agreed to a draw.
     *
     * @return {@code true} if the white {@link Player} agreed to a draw; {@code false} otherwise
     */
    @DynamoDBAttribute
    public boolean isWhitePlayerAgreedToDraw() {
        return whitePlayerAgreedToDraw;
    }

    /**
     * Sets the flag if the white {@link Player} agreed to a draw.
     *
     * @param whitePlayerAgreedToDraw {@code true} if the white {@link Player} agreed to a draw; {@code false} otherwise
     */
    public void setWhitePlayerAgreedToDraw(boolean whitePlayerAgreedToDraw) {
        this.whitePlayerAgreedToDraw = whitePlayerAgreedToDraw;
    }

    /**
     * Checks if the black {@link Player} agreed to a draw.
     *
     * @return {@code true} if the black {@link Player} agreed to a draw; {@code false} otherwise
     */
    @DynamoDBAttribute
    public boolean isBlackPlayerAgreedToDraw() {
        return blackPlayerAgreedToDraw;
    }

    /**
     * Sets the flag if the black {@link Player} agreed to a draw.
     *
     * @param blackPlayerAgreedToDraw {@code true} if the black {@link Player} agreed to a draw; {@code false} otherwise
     */
    public void setBlackPlayerAgreedToDraw(boolean blackPlayerAgreedToDraw) {
        this.blackPlayerAgreedToDraw = blackPlayerAgreedToDraw;
    }

    /**
     * Returns the started.
     *
     * @return the started
     */
    @DynamoDBAttribute
    public boolean isStarted() {
        return started;
    }

    /**
     * Returns the UUID of the host.
     *
     * @return the UUID of the host
     */
    @DynamoDBAttribute
    public String getHost() {
        return host;
    }

    /**
     * Sets the UUID of the host.
     *
     * @param host the UUID of the host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Returns the creation date.
     *
     * @return the creation date
     */
    @DynamoDBAttribute
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the creation date.
     *
     * @param creationDate the creation date
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Returns the color of the player who has the turn.
     *
     * @return the color of the player who has the turn
     */
    @DynamoDBTypeConvertedEnum
    public Ship.Color getTurn() {
        return turn;
    }

    /**
     * Sets the color of the player who has the turn.
     *
     * @param turn the color of the player who has the turn
     */
    public void setTurn(Ship.Color turn) {
        this.turn = turn;
    }

    /**
     * Checks if the {@link Match} has already started.
     *
     * @return {@code true} if the {@link Match} has already started; {@code false} otherwise
     */
    @DynamoDBAttribute
    public boolean hasStarted() {
        return started;
    }

    /**
     * Sets the {@link Match} to started.
     *
     * @param started {@code true} if the {@link Match} has already started; {@code false} otherwise
     */
    public void setStarted(boolean started) {
        this.started = started;
    }

    /**
     * Returns the start date.
     *
     * @return the start date
     */
    @DynamoDBAttribute
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Returns the end date.
     *
     * @return the end date
     */
    @DynamoDBAttribute
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the endDate.
     *
     * @param endDate the endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * Returns the {@link List} of the {@link Player}s' {@link Ship}s per turn.
     *
     * @return the {@link List} of the {@link Player}s' {@link Ship}s per turn
     */
    @DynamoDBTypeConvertedJson
    public List<Map<String, Set<Ship>>> getTurns() {
        return turns;
    }

    /**
     * Sets the {@link List} of the {@link Player}s' {@link Ship}s per turn.
     *
     * @param turns the {@link List} of the {@link Player}s' {@link Ship}s per turn
     */
    public void setTurns(List<Map<String, Set<Ship>>> turns) {
        this.turns = turns;
    }

    /**
     * Checks if the white {@link Player} is ready.
     *
     * @return {@code true} if the white {@link Player} is ready
     */
    @DynamoDBAttribute
    public boolean isWhitePlayerReady() {
        return whitePlayerReady;
    }

    /**
     * Sets the ready flag for the white {@link Player}.
     *
     * @param whitePlayerReady {@code true} if the white {@link Player} is ready
     */
    public void setWhitePlayerReady(boolean whitePlayerReady) {
        this.whitePlayerReady = whitePlayerReady;
    }

    /**
     * Checks if the black {@link Player} is ready.
     *
     * @return {@code true} if the black {@link Player} is ready
     */
    @DynamoDBAttribute
    public boolean isBlackPlayerReady() {
        return blackPlayerReady;
    }

    /**
     * Sets the ready flag for the black {@link Player}.
     *
     * @param blackPlayerReady {@code true} if the black {@link Player} is ready
     */
    public void setBlackPlayerReady(boolean blackPlayerReady) {
        this.blackPlayerReady = blackPlayerReady;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Match match = (Match) o;
        return draw == match.draw
                && whitePlayerAgreedToDraw == match.whitePlayerAgreedToDraw
                && blackPlayerAgreedToDraw == match.blackPlayerAgreedToDraw
                && started == match.started
                && whitePlayerReady == match.whitePlayerReady
                && blackPlayerReady == match.blackPlayerReady
                && Objects.equals(uuid, match.uuid)
                && Objects.equals(whitePlayer, match.whitePlayer)
                && Objects.equals(blackPlayer, match.blackPlayer)
                && Objects.equals(winner, match.winner)
                && Objects.equals(loser, match.loser)
                && Objects.equals(host, match.host)
                && Objects.equals(creationDate, match.creationDate)
                && turn == match.turn
                && Objects.equals(startDate, match.startDate)
                && Objects.equals(endDate, match.endDate)
                && Objects.equals(turns, match.turns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, whitePlayer, blackPlayer, winner, loser, draw, whitePlayerAgreedToDraw,
                blackPlayerAgreedToDraw, host, creationDate, turn, started, startDate, endDate, whitePlayerReady,
                blackPlayerReady, turns);
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        return gson.toJson(this);
    }
}