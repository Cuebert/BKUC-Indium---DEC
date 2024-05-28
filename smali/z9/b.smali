.class public final synthetic Lz9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lz9/c;


# direct methods
.method public synthetic constructor <init>(Lz9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz9/b;->a:Lz9/c;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lz9/b;->a:Lz9/c;

    invoke-static {v0, p1}, Lz9/c;->b(Lz9/c;Lorg/json/JSONObject;)V

    return-void
.end method
