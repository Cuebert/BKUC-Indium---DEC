.class public Lorg/webrtc/Logging;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/Logging$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/logging/Logger;

.field private static volatile b:Z

.field private static c:Lorg/webrtc/a;

.field private static d:Lorg/webrtc/Logging$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lorg/webrtc/Logging;->a()Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/webrtc/Logging;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method private static a()Ljava/util/logging/Logger;
    .locals 2

    const-string v0, "org.webrtc.Logging"

    .line 1
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    .line 2
    sget-object v1, Ljava/util/logging/Level;->ALL:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->setLevel(Ljava/util/logging/Level;)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lorg/webrtc/Logging$b;->o:Lorg/webrtc/Logging$b;

    invoke-static {v0, p0, p1}, Lorg/webrtc/Logging;->d(Lorg/webrtc/Logging$b;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lorg/webrtc/Logging$b;->q:Lorg/webrtc/Logging$b;

    invoke-static {v0, p0, p1}, Lorg/webrtc/Logging;->d(Lorg/webrtc/Logging$b;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static d(Lorg/webrtc/Logging$b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_6

    if-eqz p2, :cond_6

    .line 1
    sget-object v0, Lorg/webrtc/Logging;->c:Lorg/webrtc/a;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lorg/webrtc/Logging;->d:Lorg/webrtc/Logging$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ge v0, v1, :cond_0

    return-void

    .line 3
    :cond_0
    sget-object v0, Lorg/webrtc/Logging;->c:Lorg/webrtc/a;

    invoke-interface {v0, p2, p0, p1}, Lorg/webrtc/a;->a(Ljava/lang/String;Lorg/webrtc/Logging$b;Ljava/lang/String;)V

    return-void

    .line 4
    :cond_1
    sget-boolean v0, Lorg/webrtc/Logging;->b:Z

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    invoke-static {p0, p1, p2}, Lorg/webrtc/Logging;->nativeLog(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 6
    :cond_2
    sget-object v0, Lorg/webrtc/Logging$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_5

    const/4 v0, 0x2

    if-eq p0, v0, :cond_4

    const/4 v0, 0x3

    if-eq p0, v0, :cond_3

    .line 7
    sget-object p0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    goto :goto_0

    .line 8
    :cond_3
    sget-object p0, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    goto :goto_0

    .line 9
    :cond_4
    sget-object p0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    goto :goto_0

    .line 10
    :cond_5
    sget-object p0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 11
    :goto_0
    sget-object v0, Lorg/webrtc/Logging;->a:Ljava/util/logging/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    return-void

    .line 12
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Logging tag or message may not be null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lorg/webrtc/Logging$b;->p:Lorg/webrtc/Logging$b;

    invoke-static {v0, p0, p1}, Lorg/webrtc/Logging;->d(Lorg/webrtc/Logging$b;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static native nativeLog(ILjava/lang/String;Ljava/lang/String;)V
.end method
