.class public final synthetic Lf7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfa/a$b;


# instance fields
.field public final synthetic a:Lcom/roblox/client/game/c;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/game/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/g;->a:Lcom/roblox/client/game/c;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lf7/g;->a:Lcom/roblox/client/game/c;

    invoke-static {v0, p1}, Lcom/roblox/client/game/c;->b(Lcom/roblox/client/game/c;Lorg/json/JSONObject;)V

    return-void
.end method
