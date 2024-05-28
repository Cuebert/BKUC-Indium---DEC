.class public final synthetic Lja/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lja/e;


# direct methods
.method public synthetic constructor <init>(Lja/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja/a;->a:Lja/e;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lja/a;->a:Lja/e;

    invoke-static {v0, p1}, Lja/e;->a(Lja/e;Lorg/json/JSONObject;)V

    return-void
.end method
