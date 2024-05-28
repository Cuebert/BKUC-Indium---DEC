.class Lbacktraceio/library/services/BacktraceReportSender;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CHUNK_SIZE:I = 0x20000

.field private static final LOG_TAG:Ljava/lang/String; = "BacktraceReportSender"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static getResponse(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Reading response from HTTP request"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v1, 0x190

    if-ge v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object p0

    .line 5
    :goto_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 6
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    :goto_1
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 9
    :cond_1
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 10
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static sendEvents(Ljava/lang/String;Ljava/lang/String;Lbacktraceio/library/models/metrics/EventsPayload;Lbacktraceio/library/events/OnServerErrorEventListener;)Lbacktraceio/library/models/metrics/EventsResult;
    .locals 11

    const-string v0, "Disconnecting HttpUrlConnection successful"

    const-string v1, "Disconnecting HttpUrlConnection failed"

    const/4 v2, 0x0

    const/4 v3, -0x1

    .line 1
    :try_start_0
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    check-cast v4, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v2, "POST"

    .line 3
    invoke-virtual {v4, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 4
    invoke-virtual {v4, v2}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    const/4 v5, 0x1

    .line 5
    invoke-virtual {v4, v5}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 6
    invoke-virtual {v4, v5}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    const-string v6, "Connection"

    const-string v7, "Keep-Alive"

    .line 7
    invoke-virtual {v4, v6, v7}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "Content-Type"

    .line 8
    invoke-static {}, Lbacktraceio/library/common/RequestHelper;->getContentType()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    sget-object v6, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    const-string v7, "HttpURLConnection successfully initialized"

    invoke-static {v6, v7}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    new-instance v7, Ljava/io/DataOutputStream;

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 11
    invoke-static {v7, p1}, Lbacktraceio/library/common/RequestHelper;->addJson(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 12
    invoke-static {v7}, Lbacktraceio/library/common/RequestHelper;->addEndOfRequest(Ljava/io/OutputStream;)V

    .line 13
    invoke-virtual {v7}, Ljava/io/DataOutputStream;->flush()V

    .line 14
    invoke-virtual {v7}, Ljava/io/DataOutputStream;->close()V

    .line 15
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    .line 16
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Received response status from Backtrace API for HTTP request is: "

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v6, p1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0xc8

    if-ne v3, p1, :cond_0

    .line 17
    new-instance p1, Lbacktraceio/library/models/metrics/EventsResult;

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v2

    sget-object v5, Lbacktraceio/library/models/types/BacktraceResultStatus;->Ok:Lbacktraceio/library/models/types/BacktraceResultStatus;

    invoke-direct {p1, p2, v2, v5, v3}, Lbacktraceio/library/models/metrics/EventsResult;-><init>(Lbacktraceio/library/models/metrics/EventsPayload;Ljava/lang/String;Lbacktraceio/library/models/types/BacktraceResultStatus;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    :try_start_2
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 19
    invoke-static {v6, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_1

    .line 20
    :cond_0
    :try_start_3
    invoke-static {v4}, Lbacktraceio/library/services/BacktraceReportSender;->getResponse(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object p1

    .line 21
    invoke-static {p1}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 22
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object p1

    .line 23
    :cond_1
    new-instance v6, Lbacktraceio/library/models/types/HttpException;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "%s: %s"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v2

    aput-object p1, v9, v5

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v6, v7, p1}, Lbacktraceio/library/models/types/HttpException;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    throw v6
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p0

    move-object v2, v4

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v2, v4

    goto :goto_0

    :catchall_1
    move-exception p0

    goto :goto_2

    :catch_1
    move-exception p1

    :goto_0
    if-eqz p3, :cond_2

    .line 24
    :try_start_4
    sget-object v4, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    const-string v5, "Custom handler on server error"

    invoke-static {v4, v5}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    invoke-interface {p3, p1}, Lbacktraceio/library/events/OnServerErrorEventListener;->onEvent(Ljava/lang/Exception;)V

    .line 26
    :cond_2
    sget-object p3, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    const-string v4, "Sending HTTP request failed to Backtrace API"

    invoke-static {p3, v4, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 27
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed HTTP request URL "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p3, p0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    invoke-static {p2, p1, v3}, Lbacktraceio/library/models/metrics/EventsResult;->OnError(Lbacktraceio/library/models/metrics/EventsPayload;Ljava/lang/Exception;I)Lbacktraceio/library/models/metrics/EventsResult;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v2, :cond_3

    .line 29
    :try_start_5
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 30
    invoke-static {p3, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_1

    :catch_2
    move-exception p0

    .line 31
    sget-object p1, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    invoke-static {p1, v1, p0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 32
    invoke-static {p2, p0, v3}, Lbacktraceio/library/models/metrics/EventsResult;->OnError(Lbacktraceio/library/models/metrics/EventsPayload;Ljava/lang/Exception;I)Lbacktraceio/library/models/metrics/EventsResult;

    move-result-object p1

    :cond_3
    :goto_1
    return-object p1

    :goto_2
    if-eqz v2, :cond_4

    .line 33
    :try_start_6
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 34
    sget-object p1, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    invoke-static {p1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_3

    :catch_3
    move-exception p1

    .line 35
    sget-object p3, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    invoke-static {p3, v1, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 36
    invoke-static {p2, p1, v3}, Lbacktraceio/library/models/metrics/EventsResult;->OnError(Lbacktraceio/library/models/metrics/EventsPayload;Ljava/lang/Exception;I)Lbacktraceio/library/models/metrics/EventsResult;

    .line 37
    :cond_4
    :goto_3
    throw p0
.end method

.method static sendReport(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerErrorEventListener;)Lbacktraceio/library/models/BacktraceResult;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            "Lbacktraceio/library/events/OnServerErrorEventListener;",
            ")",
            "Lbacktraceio/library/models/BacktraceResult;"
        }
    .end annotation

    const-string v0, "Disconnecting HttpUrlConnection successful"

    const-string v1, "Disconnecting HttpUrlConnection failed"

    const/4 v2, 0x0

    .line 1
    :try_start_0
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p0

    check-cast p0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v2, "POST"

    .line 3
    invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 4
    invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    const/4 v3, 0x1

    .line 5
    invoke-virtual {p0, v3}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 6
    invoke-virtual {p0, v3}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    const/high16 v4, 0x20000

    .line 7
    invoke-virtual {p0, v4}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    const-string v4, "Connection"

    const-string v5, "Keep-Alive"

    .line 8
    invoke-virtual {p0, v4, v5}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "Cache-Control"

    const-string v5, "no-cache"

    .line 9
    invoke-virtual {p0, v4, v5}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "Content-Type"

    .line 10
    invoke-static {}, Lbacktraceio/library/common/MultiFormRequestHelper;->getContentType()Ljava/lang/String;

    move-result-object v5

    .line 11
    invoke-virtual {p0, v4, v5}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    sget-object v4, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    const-string v5, "HttpURLConnection successfully initialized"

    invoke-static {v4, v5}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    new-instance v5, Ljava/io/DataOutputStream;

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 14
    invoke-static {v5, p1}, Lbacktraceio/library/common/MultiFormRequestHelper;->addJson(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 15
    invoke-static {v5, p2}, Lbacktraceio/library/common/MultiFormRequestHelper;->addFiles(Ljava/io/OutputStream;Ljava/util/List;)V

    .line 16
    invoke-static {v5}, Lbacktraceio/library/common/MultiFormRequestHelper;->addEndOfRequest(Ljava/io/OutputStream;)V

    .line 17
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->flush()V

    .line 18
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V

    .line 19
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    .line 20
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Received response status from Backtrace API for HTTP request is: "

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v4, p2}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p2, 0xc8

    if-ne p1, p2, :cond_0

    .line 21
    invoke-static {p0}, Lbacktraceio/library/services/BacktraceReportSender;->getResponse(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object p1

    .line 22
    invoke-static {p1}, Lbacktraceio/library/common/BacktraceSerializeHelper;->backtraceResultFromJson(Ljava/lang/String;)Lbacktraceio/library/models/BacktraceResult;

    move-result-object p1

    .line 23
    invoke-virtual {p1, p3}, Lbacktraceio/library/models/BacktraceResult;->setBacktraceReport(Lbacktraceio/library/models/json/BacktraceReport;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    :try_start_2
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 25
    invoke-static {v4, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    .line 26
    :cond_0
    :try_start_3
    invoke-static {p0}, Lbacktraceio/library/services/BacktraceReportSender;->getResponse(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object p2

    .line 27
    invoke-static {p2}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 28
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object p2

    .line 29
    :cond_1
    new-instance v4, Lbacktraceio/library/models/types/HttpException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "%s: %s"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v2

    aput-object p2, v7, v3

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, v5, p1}, Lbacktraceio/library/models/types/HttpException;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    throw v4
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    move-object v2, p0

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v2, p0

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    :goto_0
    if-eqz p4, :cond_2

    .line 30
    :try_start_4
    sget-object p0, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Custom handler on server error"

    invoke-static {p0, p2}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    invoke-interface {p4, p1}, Lbacktraceio/library/events/OnServerErrorEventListener;->onEvent(Ljava/lang/Exception;)V

    .line 32
    :cond_2
    sget-object p0, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Sending HTTP request failed to Backtrace API"

    invoke-static {p0, p2, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 33
    invoke-static {p3, p1}, Lbacktraceio/library/models/BacktraceResult;->OnError(Lbacktraceio/library/models/json/BacktraceReport;Ljava/lang/Exception;)Lbacktraceio/library/models/BacktraceResult;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v2, :cond_3

    .line 34
    :try_start_5
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 35
    invoke-static {p0, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_1

    :catch_2
    move-exception p0

    .line 36
    sget-object p1, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    invoke-static {p1, v1, p0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 37
    invoke-static {p3, p0}, Lbacktraceio/library/models/BacktraceResult;->OnError(Lbacktraceio/library/models/json/BacktraceReport;Ljava/lang/Exception;)Lbacktraceio/library/models/BacktraceResult;

    move-result-object p1

    :cond_3
    :goto_1
    return-object p1

    :goto_2
    if-eqz v2, :cond_4

    .line 38
    :try_start_6
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 39
    sget-object p0, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    invoke-static {p0, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_3

    :catch_3
    move-exception p0

    .line 40
    sget-object p2, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    invoke-static {p2, v1, p0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 41
    invoke-static {p3, p0}, Lbacktraceio/library/models/BacktraceResult;->OnError(Lbacktraceio/library/models/json/BacktraceReport;Ljava/lang/Exception;)Lbacktraceio/library/models/BacktraceResult;

    .line 42
    :cond_4
    :goto_3
    throw p1
.end method
