.class public Ll7/a;
.super Ll9/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Analytics"

    invoke-direct {p0, v0}, Ll9/b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ll9/a;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ll9/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
