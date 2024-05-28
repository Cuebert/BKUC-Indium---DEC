.class public Lv8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;


# direct methods
.method public static a()V
    .locals 2

    .line 1
    sget-object v0, Lv8/b;->b:Ljava/lang/String;

    sget-object v1, Lv8/b;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roblox/client/f0;->u(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    sput-object v0, Lv8/b;->b:Ljava/lang/String;

    .line 3
    sput-object v0, Lv8/b;->a:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lv8/b;->a:Ljava/lang/String;

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/roblox/client/f0;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    sput-object p0, Lv8/b;->b:Ljava/lang/String;

    return-void
.end method
