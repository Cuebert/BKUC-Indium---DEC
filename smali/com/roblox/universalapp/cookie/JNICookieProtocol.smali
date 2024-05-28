.class public Lcom/roblox/universalapp/cookie/JNICookieProtocol;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;
    }
.end annotation


# static fields
.field private static a:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static b:Lcom/roblox/universalapp/cookie/JNICookieProtocol;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/roblox/universalapp/cookie/JNICookieProtocol;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/roblox/universalapp/cookie/JNICookieProtocol;
    .locals 1

    .line 1
    sget-object v0, Lcom/roblox/universalapp/cookie/JNICookieProtocol;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/roblox/universalapp/cookie/JNICookieProtocol;

    invoke-direct {v0}, Lcom/roblox/universalapp/cookie/JNICookieProtocol;-><init>()V

    sput-object v0, Lcom/roblox/universalapp/cookie/JNICookieProtocol;->b:Lcom/roblox/universalapp/cookie/JNICookieProtocol;

    .line 3
    :cond_0
    sget-object v0, Lcom/roblox/universalapp/cookie/JNICookieProtocol;->b:Lcom/roblox/universalapp/cookie/JNICookieProtocol;

    return-object v0
.end method


# virtual methods
.method public native updateOnSetCookieHandler(Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;)V
.end method
