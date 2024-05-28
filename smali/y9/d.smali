.class public final synthetic Ly9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Ly9/i;


# direct methods
.method public synthetic constructor <init>(Ly9/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly9/d;->a:Ly9/i;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Ly9/d;->a:Ly9/i;

    invoke-static {v0, p1}, Ly9/i;->d(Ly9/i;Lorg/json/JSONObject;)V

    return-void
.end method
