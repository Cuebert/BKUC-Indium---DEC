.class public final synthetic Lna/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lna/d;


# direct methods
.method public synthetic constructor <init>(Lna/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lna/a;->a:Lna/d;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lna/a;->a:Lna/d;

    invoke-static {v0, p1}, Lna/d;->a(Lna/d;Lorg/json/JSONObject;)V

    return-void
.end method
