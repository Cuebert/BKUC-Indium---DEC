.class public abstract Lcom/roblox/audio/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/audio/a$b;,
        Lcom/roblox/audio/a$a;
    }
.end annotation


# static fields
.field private static a:Lcom/roblox/audio/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lcom/roblox/audio/a;
    .locals 1

    sget-object v0, Lcom/roblox/audio/a;->a:Lcom/roblox/audio/a;

    return-object v0
.end method

.method public static d()Z
    .locals 1

    sget-object v0, Lcom/roblox/audio/a;->a:Lcom/roblox/audio/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    sget-object v0, Lcom/roblox/audio/a;->a:Lcom/roblox/audio/a;

    if-ne p0, v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/roblox/audio/a;->e()V

    const/4 v0, 0x0

    .line 3
    sput-object v0, Lcom/roblox/audio/a;->a:Lcom/roblox/audio/a;

    :cond_0
    return-void
.end method

.method public abstract c()Lcom/roblox/audio/a$a;
.end method

.method public abstract e()V
.end method

.method public abstract f(Landroidx/appcompat/app/c;)V
.end method

.method public g(Z)V
    .locals 0

    return-void
.end method

.method protected h(Lcom/roblox/audio/a;)V
    .locals 0

    sput-object p1, Lcom/roblox/audio/a;->a:Lcom/roblox/audio/a;

    return-void
.end method

.method public abstract i(Lcom/roblox/audio/a$b;)V
.end method

.method public abstract j()V
.end method
