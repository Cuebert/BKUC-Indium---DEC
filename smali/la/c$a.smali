.class Lla/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lla/c;->s(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lla/c;


# direct methods
.method constructor <init>(Lla/c;)V
    .locals 0

    iput-object p1, p0, Lla/c$a;->a:Lla/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/b;
    .locals 1

    iget-object v0, p0, Lla/c$a;->a:Lla/c;

    invoke-static {v0, p1}, Lla/c;->c(Lla/c;Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/b;

    move-result-object p1

    return-object p1
.end method
