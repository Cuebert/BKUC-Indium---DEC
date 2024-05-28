.class public final synthetic Lo9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic a:Lo9/i;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/webkit/ValueCallback;


# direct methods
.method public synthetic constructor <init>(Lo9/i;Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/h;->a:Lo9/i;

    iput-object p2, p0, Lo9/h;->b:Ljava/lang/String;

    iput-object p3, p0, Lo9/h;->c:Landroid/webkit/ValueCallback;

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lo9/h;->a:Lo9/i;

    iget-object v1, p0, Lo9/h;->b:Ljava/lang/String;

    iget-object v2, p0, Lo9/h;->c:Landroid/webkit/ValueCallback;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, v1, v2, p1}, Lo9/i;->c(Lo9/i;Ljava/lang/String;Landroid/webkit/ValueCallback;Ljava/lang/Boolean;)V

    return-void
.end method
