.class public final synthetic Lcom/roblox/client/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfa/a$b;


# instance fields
.field public final synthetic a:Lcom/roblox/client/ActivityNativeMain;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/c;->a:Lcom/roblox/client/ActivityNativeMain;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/c;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-static {v0, p1}, Lcom/roblox/client/ActivityNativeMain;->A1(Lcom/roblox/client/ActivityNativeMain;Lorg/json/JSONObject;)V

    return-void
.end method
