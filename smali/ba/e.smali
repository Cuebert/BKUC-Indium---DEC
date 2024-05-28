.class public final synthetic Lba/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lba/g;


# direct methods
.method public synthetic constructor <init>(Lba/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/e;->a:Lba/g;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lba/e;->a:Lba/g;

    invoke-static {v0, p1}, Lba/g;->e(Lba/g;Lorg/json/JSONObject;)V

    return-void
.end method
