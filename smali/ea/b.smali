.class public final synthetic Lea/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lea/d;


# direct methods
.method public synthetic constructor <init>(Lea/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lea/b;->a:Lea/d;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lea/b;->a:Lea/d;

    invoke-static {v0, p1}, Lea/d;->b(Lea/d;Lorg/json/JSONObject;)V

    return-void
.end method
