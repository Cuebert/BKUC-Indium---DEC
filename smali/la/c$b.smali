.class Lla/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


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

    iput-object p1, p0, Lla/c$b;->a:Lla/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lla/c$b;->a:Lla/c;

    invoke-static {v0, p1}, Lla/c;->d(Lla/c;Lorg/json/JSONObject;)V

    return-void
.end method
