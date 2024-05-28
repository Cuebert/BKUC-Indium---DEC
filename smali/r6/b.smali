.class public final Lr6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Lcom/roblox/client/c1$d;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {p0, v0, v1, v2, v1}, Lr6/b;-><init>(ZLcom/roblox/client/c1$d;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(ZLcom/roblox/client/c1$d;)V
    .locals 1

    const-string v0, "upgradeCheckResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lr6/b;->a:Z

    .line 2
    iput-object p2, p0, Lr6/b;->b:Lcom/roblox/client/c1$d;

    return-void
.end method

.method public synthetic constructor <init>(ZLcom/roblox/client/c1$d;ILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 3
    new-instance p2, Lcom/roblox/client/c1$d;

    invoke-direct {p2}, Lcom/roblox/client/c1$d;-><init>()V

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2}, Lr6/b;-><init>(ZLcom/roblox/client/c1$d;)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lr6/b;->a:Z

    return v0
.end method

.method public final b()Lcom/roblox/client/c1$d;
    .locals 1

    iget-object v0, p0, Lr6/b;->b:Lcom/roblox/client/c1$d;

    return-object v0
.end method

.method public final c(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
