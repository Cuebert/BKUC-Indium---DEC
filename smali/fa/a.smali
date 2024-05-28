.class public Lfa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfa/a$b;
    }
.end annotation


# static fields
.field private static c:Lfa/a;

.field private static d:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field private b:Lcom/roblox/universalapp/messagebus/Connection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lfa/a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->e()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    iput-object v0, p0, Lfa/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lfa/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method public static a()Lfa/a;
    .locals 1

    .line 1
    sget-object v0, Lfa/a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lfa/a;

    invoke-direct {v0}, Lfa/a;-><init>()V

    sput-object v0, Lfa/a;->c:Lfa/a;

    .line 3
    :cond_0
    sget-object v0, Lfa/a;->c:Lfa/a;

    return-object v0
.end method


# virtual methods
.method public b(Lfa/a$b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lfa/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    if-eqz v0, :cond_0

    const-string p1, "ExperienceProtocol"

    const-string v0, "Attempted to set ExperienceProtocol java callback, but one is already set."

    .line 2
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lfa/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/experience/JNIExperienceProtocol;->getLaunchId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lfa/a$a;

    invoke-direct {v2, p0, p1}, Lfa/a$a;-><init>(Lfa/a;Lfa/a$b;)V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Lfa/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lfa/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    if-nez v0, :cond_0

    const-string v0, "ExperienceProtocol"

    const-string v1, "Attempted to disconnect ExperienceProtocol java callback, but one is not connected."

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lfa/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method
