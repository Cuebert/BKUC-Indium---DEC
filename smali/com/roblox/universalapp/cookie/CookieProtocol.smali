.class public Lcom/roblox/universalapp/cookie/CookieProtocol;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/universalapp/cookie/CookieProtocol$OnSetCookieHandlerImpl;
    }
.end annotation


# static fields
.field private static a:Lcom/roblox/universalapp/cookie/CookieProtocol;

.field private static b:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/roblox/universalapp/cookie/CookieProtocol;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method private constructor <init>(Lcom/roblox/universalapp/cookie/JNICookieProtocol;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/roblox/universalapp/cookie/CookieProtocol$OnSetCookieHandlerImpl;

    invoke-direct {v0}, Lcom/roblox/universalapp/cookie/CookieProtocol$OnSetCookieHandlerImpl;-><init>()V

    invoke-virtual {p1, v0}, Lcom/roblox/universalapp/cookie/JNICookieProtocol;->updateOnSetCookieHandler(Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;)V

    return-void
.end method

.method public static a()Lcom/roblox/universalapp/cookie/CookieProtocol;
    .locals 2

    .line 1
    sget-object v0, Lcom/roblox/universalapp/cookie/CookieProtocol;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/roblox/universalapp/cookie/CookieProtocol;

    invoke-static {}, Lcom/roblox/universalapp/cookie/JNICookieProtocol;->a()Lcom/roblox/universalapp/cookie/JNICookieProtocol;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roblox/universalapp/cookie/CookieProtocol;-><init>(Lcom/roblox/universalapp/cookie/JNICookieProtocol;)V

    sput-object v0, Lcom/roblox/universalapp/cookie/CookieProtocol;->a:Lcom/roblox/universalapp/cookie/CookieProtocol;

    .line 3
    :cond_0
    sget-object v0, Lcom/roblox/universalapp/cookie/CookieProtocol;->a:Lcom/roblox/universalapp/cookie/CookieProtocol;

    return-object v0
.end method
