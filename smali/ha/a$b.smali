.class Lha/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lha/a;->h(Landroidx/appcompat/app/c;Landroid/content/Intent;ILha/a$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/app/c;

.field final synthetic b:Landroid/content/Intent;

.field final synthetic c:I

.field final synthetic d:Lha/a$e;

.field final synthetic e:Lha/a;


# direct methods
.method constructor <init>(Lha/a;Landroidx/appcompat/app/c;Landroid/content/Intent;ILha/a$e;)V
    .locals 0

    iput-object p1, p0, Lha/a$b;->e:Lha/a;

    iput-object p2, p0, Lha/a$b;->a:Landroidx/appcompat/app/c;

    iput-object p3, p0, Lha/a$b;->b:Landroid/content/Intent;

    iput p4, p0, Lha/a$b;->c:I

    iput-object p5, p0, Lha/a$b;->d:Lha/a$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 7

    :try_start_0
    const-string v0, "url"

    .line 1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "context"

    .line 2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    iget-object v1, p0, Lha/a$b;->a:Landroidx/appcompat/app/c;

    iget-object v4, p0, Lha/a$b;->b:Landroid/content/Intent;

    iget v5, p0, Lha/a$b;->c:I

    iget-object v6, p0, Lha/a$b;->d:Lha/a$e;

    invoke-static/range {v1 .. v6}, Lha/a;->e(Landroidx/appcompat/app/c;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ILha/a$e;)V

    return-void

    :catch_0
    const-string p1, "ContentSharingProtocol"

    const-string v0, "Error parsing share url data."

    .line 4
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
