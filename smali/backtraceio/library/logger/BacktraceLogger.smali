.class public Lbacktraceio/library/logger/BacktraceLogger;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final BASE_TAG:Ljava/lang/String; = "BacktraceLogger: "

.field private static logLevel:Lbacktraceio/library/logger/LogLevel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lbacktraceio/library/logger/LogLevel;->OFF:Lbacktraceio/library/logger/LogLevel;

    sput-object v0, Lbacktraceio/library/logger/BacktraceLogger;->logLevel:Lbacktraceio/library/logger/LogLevel;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 1
    sget-object v0, Lbacktraceio/library/logger/BacktraceLogger;->logLevel:Lbacktraceio/library/logger/LogLevel;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lbacktraceio/library/logger/LogLevel;->DEBUG:Lbacktraceio/library/logger/LogLevel;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 2
    invoke-static {p0}, Lbacktraceio/library/logger/BacktraceLogger;->getTag(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 1
    sget-object v0, Lbacktraceio/library/logger/BacktraceLogger;->logLevel:Lbacktraceio/library/logger/LogLevel;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lbacktraceio/library/logger/LogLevel;->ERROR:Lbacktraceio/library/logger/LogLevel;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 2
    invoke-static {p0}, Lbacktraceio/library/logger/BacktraceLogger;->getTag(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    .locals 2

    .line 3
    sget-object v0, Lbacktraceio/library/logger/BacktraceLogger;->logLevel:Lbacktraceio/library/logger/LogLevel;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lbacktraceio/library/logger/LogLevel;->ERROR:Lbacktraceio/library/logger/LogLevel;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 4
    invoke-static {p0}, Lbacktraceio/library/logger/BacktraceLogger;->getTag(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static getTag(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BacktraceLogger: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static setLevel(Lbacktraceio/library/logger/LogLevel;)V
    .locals 0

    sput-object p0, Lbacktraceio/library/logger/BacktraceLogger;->logLevel:Lbacktraceio/library/logger/LogLevel;

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 1
    sget-object v0, Lbacktraceio/library/logger/BacktraceLogger;->logLevel:Lbacktraceio/library/logger/LogLevel;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lbacktraceio/library/logger/LogLevel;->WARN:Lbacktraceio/library/logger/LogLevel;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 2
    invoke-static {p0}, Lbacktraceio/library/logger/BacktraceLogger;->getTag(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
