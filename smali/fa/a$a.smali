.class Lfa/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfa/a;->b(Lfa/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lfa/a$b;

.field final synthetic b:Lfa/a;


# direct methods
.method constructor <init>(Lfa/a;Lfa/a$b;)V
    .locals 0

    iput-object p1, p0, Lfa/a$a;->b:Lfa/a;

    iput-object p2, p0, Lfa/a$a;->a:Lfa/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lfa/a$a;->a:Lfa/a$b;

    invoke-interface {v0, p1}, Lfa/a$b;->a(Lorg/json/JSONObject;)V

    return-void
.end method
